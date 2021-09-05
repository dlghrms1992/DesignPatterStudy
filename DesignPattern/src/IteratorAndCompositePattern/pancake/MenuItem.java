package IteratorAndCompositePattern.pancake;

public class MenuItem {
	String name;
	String description;
	boolean vegeterian;
	double price;
	
	public MenuItem(String name, String decription, boolean vegetarian, double price) {
		
		this.name = name;
		this.description = description;
		this.vegeterian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
