package program5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cash_Register {
	
	//TestProgram5 prog;
	//List<Retail_Item> tested;
	
	
	Integer number;
	String describe;
	Integer invent;
	Double prices;
	
	List<Retail_Item> cashreg = new ArrayList<>();
	
	Scanner in = new Scanner(System.in);
	
	
	public void display_menu(List<Retail_Item> tested) {
		
		
		for (Retail_Item regist : tested) 
	      {
	         System.out.println(regist); // invokes toString
	         
	      }
	}
	
	public void purchase_item(Retail_Item test) {
		
		System.out.println("Enter item number: ");
		Retail_Item item = in.nextInt();
		test.add(new Retail_Item(number, describe, invent, prices));
		System.out.println(test);
		
	}

	public void get_total() {
		
	}
	
	public void show_items() {
		
	}
	
	public void clear() {
		
	}
}
