package com.techlab.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.techlab.guitar.*;

public class Inventory {

	private List guitars;

	public Inventory() {

		guitars = new LinkedList();

	}

	public void addGuitar(String serialNumber, double price, 
			Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		
		GuitarSpec spec = new GuitarSpec(builder,model,type,
				backWood,topWood);
		Guitar guitar = new Guitar(serialNumber, price, spec);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNumber) {
		
		for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	public List search(GuitarSpec searchSpec) {
		   List matchingGuitars = new LinkedList();
		 for(Iterator i=guitars.iterator();i.hasNext();) {
			Guitar guitar =(Guitar)i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
		 if(searchSpec.getBuilder()!=guitarSpec.getBuilder())
			continue;
		 String model = searchSpec.getModel();
		 if((model!= null) && (!model.equals("") && 
				 (!model.equalsIgnoreCase(guitarSpec.getModel()))))
		    continue;
		if (searchSpec.getType() != guitarSpec.getType()) 
		    continue;
		if (searchSpec.getBackWood() != guitarSpec.getBackWood())
			continue;
		if (searchSpec.getTopWood() != guitarSpec.getTopWood())
			continue;
		matchingGuitars.add(guitar);
						 
		}
		return matchingGuitars;
	}

}
