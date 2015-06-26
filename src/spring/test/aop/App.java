package spring.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("springConfig.xml");

		MyData myData = (MyData) context.getBean("myData");

		myData.saveData("This is my data");
		
		System.out.println("-----------------");
		myData.getData();
		
		System.out.println("-----------------");
		myData.concatData(null);
	}

}
