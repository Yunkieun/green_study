package hb_p;

public class Hamburger {
	
	String hname, kind;
	String calorie;
	
	public Hamburger() {
		System.out.println("Hamburger 기본생성자");
	}
	
	
	public String getHname() {
		return hname;
	}


	public void setHname(String hname) {
		this.hname = hname;
	}


	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public String getCalorie() {
		return calorie;
	}


	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}


	@Override
	public String toString() {
		return "Hamburger [버거=" + hname + ", 종류=" + kind + ", 칼로리=" + calorie + "]";
	}
	
	
	
}
