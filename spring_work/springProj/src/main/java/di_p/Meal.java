package di_p;

public class Meal {
	
	String name, menu;

	public Meal(String name, String menu) {
		super();
		this.name = name;
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Meal [name=" + name + ", menu=" + menu + "]";
	}
		
}
