package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Basket;
import di_p.Bicycle;
import di_p.Handle;
import di_p.Tire;

public class By_main {
	
	public static void main(String[] args) {
		
		Bicycle bc1 = new Bicycle();
		Tire tire1 = new Tire();
		Handle handle1 = new Handle();
		Basket basket1 = new Basket();
		
		tire1.setName("바퀴");
		tire1.setNum(3);
		
		handle1.setName("핸들");
		
		basket1.setName("바구니");
		
		bc1.setName("세발자전거");
		bc1.setHandle(handle1);
		bc1.setTire(tire1);
		bc1.setBasket(basket1);
		
		
		
		System.out.println(bc1);
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/ex.xml");
		
		Bicycle bc2 = (Bicycle)context.getBean("bc2");
		Bicycle bc3 = (Bicycle)context.getBean("bc3");
		Bicycle bc4 = (Bicycle)context.getBean("bc4");
		System.out.println(bc2);
		System.out.println(bc3);
		System.out.println(bc4);
		
	}
}