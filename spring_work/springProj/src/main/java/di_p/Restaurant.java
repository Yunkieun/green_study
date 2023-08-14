package di_p;

public class Restaurant {
	
	public Meal breakfast() {
		return new Meal("아침", "모듬과일");
	}
	
	public Meal lunch() {
		return new Meal("점심", "국밥");
	}
	
	public Meal dinner() {
		return new Meal("저녁", "치킨");
	}
}
