package hb_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hb_p.HBset;


public class Hb_main {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("hb_xml/first.xml");

		HBset hbs2 = (HBset)context.getBean("hbs2");
		
		System.out.println(hbs2);
	}

}
