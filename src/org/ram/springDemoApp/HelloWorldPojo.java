package org.ram.springDemoApp;
public class HelloWorldPojo 
{
	public HelloWorldPojo() 
	{
		System.out.println("HelloWorld Object Created.");
	}
	private String message="BeanFactory Example.";
	
	public void displayMessage() {
		System.out.println("The message is: "+message);
	}
}
