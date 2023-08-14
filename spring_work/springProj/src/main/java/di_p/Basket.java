package di_p;

public class Basket {
	String name;
	int num;
	
	public Basket() {
		System.out.println("Basket 기본생성자");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Basket setName():"+name);
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		System.out.println("Basket setNum():"+num);
		this.num = num;
	}

	@Override
	public String toString() {
		return "Basket [name=" + name + ", num=" + num + "]";
	}


	
	
}
