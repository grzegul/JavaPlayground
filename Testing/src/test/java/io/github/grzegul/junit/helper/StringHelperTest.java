package io.github.grzegul.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper s;
	
	
	@Before
	public void before(){
		s = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {
		assertEquals("CD", s.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", s.truncateAInFirst2Positions("ACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_CDEF() {
		assertEquals("CDEF", s.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void testTruncateAInFirst2Positions_CDAA() {
		assertEquals("CDAA", s.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_basicNegativeScenario(){
		assertFalse(s.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_basicPositiveScenario(){
		assertTrue(s.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_AB(){
		assertTrue(s.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_A(){
		assertEquals(false, s.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
