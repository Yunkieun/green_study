package hb_p;

public class Side {
	
	String sname;
	int num;
	
	public Side() {
		System.out.println("Side 기본생성자");
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Side [사이드메뉴=" + sname + ", 수량=" + num + "]";
	}
	
	
}
