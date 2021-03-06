package program5;

public class Retail_Item {
	
	private Integer itemNumber;
	private String item_Describe;
	private Integer units_Inventory;
	private Double price;
	
	
	public Retail_Item() {
		
	}
	
	public Retail_Item(Integer itemNumber, String item_Describe, Integer units_Inventory, Double price) {
		
		
		this.itemNumber = itemNumber;
		this.item_Describe = item_Describe;
		this.units_Inventory = units_Inventory;
		this.price = price;
		
	}
	
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public void setItem_Describe(String item_Describe) {
		this.item_Describe = item_Describe;
	}
	
	public Integer getItemNumber() {
		return itemNumber;
	}
	
	
	
	
	public String getItem_Describe() {
		return item_Describe;
	}
	
	
	
	
	public Integer getUnits_Inventory() {
		return units_Inventory;
	}
	
	public void setUnits_Inventory(int units_Inventory) {
		this.units_Inventory = units_Inventory;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	 @Override
	 public String toString()
	 {
	    return String.format(
	       "Item #: %-2d  Description: %-9s  Inventory: %-4d  Price: $%,6.2f", 
	       getItemNumber(), getItem_Describe(), 
	       getUnits_Inventory(), getPrice());
	 }

	 
	

}
