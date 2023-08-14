package di_p;

public class MyPhone {
	String name;
	Battery bt;
	Screen sc;
	Pcamera ca;
	
	public MyPhone() {
		System.out.println("MyPhone 기본생성자");
	}

	public MyPhone(String name, Battery bt, Screen sc, Pcamera ca) {
		super();
		this.name = name;
		this.bt = bt;
		this.sc = sc;
		this.ca = ca;
		System.out.println("MyPhone 생성자1");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Battery getBt() {
		return bt;
	}

	public void setBt(Battery bt) {
		this.bt = bt;
	}

	public Screen getSc() {
		return sc;
	}

	public void setSc(Screen sc) {
		this.sc = sc;
	}

	public Pcamera getCa() {
		return ca;
	}

	public void setCa(Pcamera ca) {
		this.ca = ca;
	}

	@Override
	public String toString() {
		return "MyPhone [name=" + name + ", bt=" + bt + ", sc=" + sc + ", ca=" + ca + "]";
	}
	
	
}

class Battery{
	String name, type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + ", type=" + type + "]";
	}
	
}


class Screen{
	String name, stype;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + ", stype=" + stype + "]";
	}
	
}

class Pcamera{
	String name;
	int size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Pcamera [name=" + name + ", size=" + size + "]";
	}
	
}
