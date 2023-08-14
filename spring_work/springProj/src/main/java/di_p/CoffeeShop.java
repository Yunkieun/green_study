package di_p;

abstract public class CoffeeShop {
	
	public Coffee order_am() {
		System.out.println("order_am 실행");
		return new Coffee("아메리카노",1400);
	}
	
	public void order_void() {
		//<lookup-method name="order_void" bean="co"/>
		// 가 적용되어 메소드 실행되지 않음
		System.out.println("order_void 실행");
	}
	
	public Tea order_tea() {
		System.out.println("order_tea 실행");
		return new Tea("생각대로",2000);
	}
	
	public Coffee order_private() {
		System.out.println("order_private 실행");
		return new Coffee("아프리카노",1700);
	}
	
	public Coffee order_private2() {
		System.out.println("order_private 대행 실행");
		return order_private();
	}
	
	public Coffee order_final() {
		System.out.println("order_final 실행");
		return order_final();
	}
	
	public Coffee order_static() {
		System.out.println("order_static 실행");
		return new Coffee("와이라노",2500);
	}
	
	public Coffee order_piano() {
		System.out.println("order_piano 실행");
		return new Coffee("피아노",4000);
	}
	
	
	abstract public Coffee order_hunter();

	abstract public Coffee order_latte();



}


