package com.techlab.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.guitar.Builder;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.GuitarSpec;
import com.techlab.guitar.Type;
import com.techlab.guitar.Wood;
import com.techlab.inventory.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec( Builder.FENDER,
				"Stratocastor", Type.ELECTRIC,
				Wood.ALDER, Wood.ALDER);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
		         System.out.println("We have a this for \n build :" + spec.getBuilder() + 
						" \n Model :" + spec.getModel() + "\nType : "  + spec.getType() 
						+ "\n BackWood : " +spec.getBackWood() +
						"\n TopWood " + spec.getTopWood() +
						"\n Price "+ "only $ " +
						guitar.getPrice());
			}
		}
		if(matchingGuitars.isEmpty()) {
			System.out.println("Sorry Not Found");
		}
		
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("A1960",1499.00,Builder.FENDER,"Stratocastor"
				,Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
	}

}
