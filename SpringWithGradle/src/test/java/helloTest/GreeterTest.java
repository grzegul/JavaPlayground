package helloTest;

import org.junit.Test;
import static org.junit.Assert.*;

import hello.Greeter;

public class GreeterTest {

	@Test
	public void Greeter_returnString_correct(){
		Greeter g = new Greeter();
		System.out.println(g.sayHello());
		assertEquals("Hello world!", g.sayHello());
	}

}
