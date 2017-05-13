package io.github.grzegul;

import static org.junit.Assert.*;

import org.junit.Test;

// AB => BA; RAIN => RANI; "" => ""; A => A;

public class StringHelperTest {
	StringHelper helper = new StringHelper();
	
	@Test
	public void testStrWith2CharsIsReversed() {
		
		assertEquals("BA", helper.swapLast2Chars("AB"));
	}
	@Test
	public void testStrWith4Chars() {
		assertEquals("ABDC", helper.swapLast2Chars("ABCD"));
	}
	@Test
	public void testStrWith10Chars() {
		assertEquals("ABCDEFGHJI", helper.swapLast2Chars("ABCDEFGHIJ"));
	}
	@Test
	public void testStrWith1Char() {
		assertEquals("A", helper.swapLast2Chars("A"));
	}
	@Test
	public void testStrEmpty() {
		assertEquals("", helper.swapLast2Chars(""));
	}

}
