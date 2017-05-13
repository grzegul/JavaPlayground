package io.github.grzegul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

//ABCD=>BCD, AACD=>CD, BACD=>BCD, BBAA=>BBAA, AABAA=>BAA

public class ARemoverTest {
	
	ARemover ar;
	@Before
	public void setUp(){
		ar = new ARemover();
	}
	
	@Test
	public void testARemoverNoAsInFirstTwoPositions() {
		assertEquals("BBAA", ar.remove("BBAA"));
	}
	@Test
	public void testARemoverAsInFirstTwoPositions() {
		assertEquals("CD", ar.remove("AACD"));
	}

	@Test
	public void testARemoverAInSecondPosition() {
		assertEquals("BCD", ar.remove("BACD"));
	}
	@Test
	public void testARemoverAInFirstPosition() {
		assertEquals("BCD", ar.remove("ABCD"));
	}
	@Test
	public void testARemoverAsInFirstTwoPositionsLengthMoreThan4() {
		assertEquals("BAA", ar.remove("AABAA"));
	}
	@Test
	public void testARemoverBlank() {
		assertEquals("", ar.remove(""));
	}
	
}
