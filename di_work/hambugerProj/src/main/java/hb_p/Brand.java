package hb_p;

public class Brand {
	
	 String brand;
	 
	public Brand() {
		System.out.println("Brand 기본생성자");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Brand [브랜드=" + brand + "]";
	}

	 
}
