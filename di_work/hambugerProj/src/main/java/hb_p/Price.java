package hb_p;

public class Price {

	int price;
	
	public Price() {
		System.out.println("Price 기본생성자");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [가격=" + price + "]";
	}
	
	
}
