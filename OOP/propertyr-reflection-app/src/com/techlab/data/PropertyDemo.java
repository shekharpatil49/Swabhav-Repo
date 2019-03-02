package com.techlab.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("/Users/" + "shekhar/Desktop/git/Swabhav-repository"
				+ "/OOP/propertyr-reflection-app/" + "propertyfiles/info.properties");
		property.load(fis);
		String className = property.getProperty("Swabhav.className");
		Class<?> cls = Class.forName(className);
		System.out.println(cls.getName());
		System.out.println(cls.getName());
		Method[] methods = cls.getMethods();
		System.out.println("Number of Methods "+ methods.length);
		Field[] fields = cls.getFields();
		System.out.println("Number Of Field "+ fields.length);
		/*for (Method method : methods)
			System.out.println(method.getName());*/

	}

}
