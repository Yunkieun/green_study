package di_p;


public class Tea {

	String name;
	int price;
	
	public Tea(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	
}
