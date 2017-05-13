package com.tdd.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void testForConvert_I_to_1() {
		assertEquals(new Roman("I").toArabic(), 1);
	}
	@Test
	public void testForConvert_II_to_2() {
		assertEquals(new Roman("II").toArabic(), 2);
	}
	@Test
	public void testForConvert_III_to_3() {
		assertEquals(new Roman("III").toArabic(), 3);
	}
	@Test
	public void testForConvert_IV_to_4() {
		assertEquals(new Roman("IV").toArabic(), 4);
	}
	@Test
	public void testForConvert_V_to_5() {
		assertEquals(new Roman("V").toArabic(), 5);
	}
	@Test
	public void testForConvert_VI_to_6() {
		assertEquals(new Roman("VI").toArabic(), 6);
	}
	@Test
	public void testForConvert_VII_to_7() {
		assertEquals(new Roman("VII").toArabic(), 7);
	}
	@Test
	public void testForConvert_VIII_to_8() {
		assertEquals(new Roman("VIII").toArabic(), 8);
	}
	@Test
	public void testForConvert_IX_to_9() {
		assertEquals(new Roman("IX").toArabic(), 9);
	}
	@Test
	public void testForConvert_X_to_10() {
		assertEquals(new Roman("X").toArabic(), 10);
	}
}
