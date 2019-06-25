package com.techlab.organization.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.techlab.organization.business.Employee;
import com.techlab.organization.dataacess.DiskDataLoader;
import com.techlab.organization.dataacess.IDataLoader;

public class HierarchyBuilder {

	private IDataLoader load;
	int i = 1;
	private List<Employee> level1;
	private List<Employee> level2;
	private List<Employee> level3;
	private DiskDataLoader dsk;
	private Set<Employee> data;
	private String str = "";
	private ArrayList<Employee> list = new ArrayList();

	public Set<Employee> getData() {
		return data;
	}

	public HierarchyBuilder(IDataLoader load) {

		data = load.readData();
		dsk = (DiskDataLoader) load;
	}
    
	public void buildHierarchy() throws ParserConfigurationException, TransformerException {
		
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Employee");
        Element student = doc.createElement("KING");
        
        doc.appendChild(rootElement);
        rootElement.appendChild(student);
        Element student1 = doc.createElement("ABC");
		student.appendChild(student1);
        
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("employee-new.xml"));
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.transform(source, result);
		level1 = dsk.getlevel1Employee();
		level2 = dsk.getlevel2Employee();
		level3 = dsk.getlevel3Employee();
		str = str + "KING\n";
		int index = 0;
		for (int counter = 0; counter < level1.size(); counter++) {
			if (level1.get(counter) != null) {		
				str = str + "     ->" + level1.get(counter).getEmpName() + "\n";
				//Element student1 = doc.createElement(level1.get(counter).getEmpName());
				//student.appendChild(student1);
				for (int counter1 = index; counter1 < level2.size(); counter1++) {
					if (level2.get(counter1) == null) {
						index++;
						break;

					}
					str = str + "            " + level2.get(counter1).getEmpName();
					str = str + "\n";
					index++;
					for (int counter2 = 0; counter2 < level3.size(); counter2++) {
						if (level3.get(counter2) == null)
							continue;
						if (level2.get(counter1).getEmpID() == Integer.parseInt(level3.get(counter2).getMaganerID())) {
							str = str + "                        ->" + level3.get(counter2).getEmpName() + "\n";
						}
					}
				}
			}
		}

	}

	public String returnHierarchy() {
		return str;

	}
}
