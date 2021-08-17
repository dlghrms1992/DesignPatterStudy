package Decorator.beverage;

public abstract class Beverage {
	
	String description = "제목없음";
	public enum Size { TALL, GRANTE, BENTY}
	Size size= Size.TALL;
	
	public String getDescription() {
		return description;
	};
	
	public abstract double cost();

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
	
}
