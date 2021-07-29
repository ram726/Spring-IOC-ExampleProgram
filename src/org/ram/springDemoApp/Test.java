package org.ram.springDemoApp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test 
{
	public static void main(String[] args) {
//		//1-> using BeanFactory Interface
//		
//		//creating resource object to read spring.xml file
//		Resource res=new ClassPathResource("Spring.xml");
//		
//		/*passing the reference the of resource interface to 
//		 * read data from spring.xml in BeanFactory*/
//		BeanFactory bf=new XmlBeanFactory(res);
//		
//		//creating object of HelloWorldPojo with the help of getBean()
//		//by passing the refernece id as parameter from spring.xml
//		HelloWorldPojo hw=(HelloWorldPojo) bf.getBean("hlw");
//		
//		hw.displayMessage();
		
		//2-> using ApplicationContext Interface
		
		ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		
		HelloWorldPojo hw=(HelloWorldPojo) context.getBean("hlw");
		
		hw.displayMessage();
	}
}
