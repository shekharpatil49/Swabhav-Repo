package com.techlab.factory.method.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.lang.reflect.*;
import com.techlab.factory.method.BMWFactory;
import com.techlab.factory.method.IAutoFactory;
import com.techlab.factory.method.IAutomobile;

public class TestFactoryMethod {

	public static void main(String args[])
			throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		ClassLoader classLoader = TestFactoryMethod.class.getClassLoader();

		FileReader reader = new FileReader(
				"/Users/shekhar/Desktop/git/Swabhav-repository/DesignPattern/factory.method/src/factory.properties");
		Properties p = new Properties();
		p.load(reader);
		Class c = Class.forName(p.getProperty("factoryName"));
		Method m = c.getDeclaredMethod("getInstance", null);
		IAutoFactory o = (IAutoFactory) m.invoke(null, null);
		IAutomobile a = o.make();
		a.start();
		a.stop();
	}

}
