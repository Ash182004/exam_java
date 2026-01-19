package com.training.test1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class MerchandiseInventory {
	public static void main(String[] args) throws FileNotFoundException {
		 ArrayList<merchandise> list= new ArrayList<>();
		

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("input.dat.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split("\\s+");

	                String id = parts[0];
	                int qty = Integer.parseInt(parts[1]);
	                double price = Double.parseDouble(parts[2]);

	                list.add(new merchandise(id, qty, price));
	            }

	            br.close();

	        } catch (IOException e) {
	            System.out.println("File reading error: " + e.getMessage());
	        }
		System.out.println("sorted in ascending order by item id");
		for(merchandise m:list) {
			System.out.println(m);
		}
		
		Collections.sort(list,new Comparator<merchandise>() {
			public int compare(merchandise m1, merchandise m2) {
				return Double.compare(m1.unitPrice, m2.unitPrice);
			}
		});
		
		System.out.println("sorted in ascending order by item id");
		for(merchandise m:list) {
			System.out.println(m);
		}
		
	
		
		
		
		
	}

}
