/**
 * 
 */
package com.Day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SIDHARTHA
 *
 */
public class ProductAlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> product= new ArrayList<String>();
		product.add("CAR");
		product.add("BIKE");
		product.add("Scooter");
		product.add("Bicycle");
		product.add("BUs");
		product.add("Truck");
		
		Collections.sort(product);
		
		for(String p:product)
		{
			System.out.println(p);
		}
		

	}

}
