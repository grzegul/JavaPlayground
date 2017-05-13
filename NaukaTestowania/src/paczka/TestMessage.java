package paczka;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMessage {
	String s = "elox";
	MessageUtil m = new MessageUtil(s);
	
	@Test
	public void testPrintMessage() {
		assertEquals(s, m.printMessage());
	}

}
