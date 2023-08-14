package di_p;

public class Bicycle {

	String name;
	Tire tire;
	Handle handle;
	Basket basket;
	
	public Bicycle() {
		System.out.println("자전거 기본생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName():"+name);
		this.name = name;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		System.out.println("setTire():"+tire);
		this.tire = tire;
	}

	public Handle getHandle() {
		return handle;
	}

	public void setHandle(Handle handle) {
		System.out.println("setHandle():"+handle);
		this.handle = handle;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		System.out.println("setBasket():"+basket);
		this.basket = basket;
	}

	@Override
	public String toString() {
		return "Bicycle [종류=" + name + ", tire=" + tire + ", handle=" + handle + ", basket=" + basket + "]";
	}
	
	

}
