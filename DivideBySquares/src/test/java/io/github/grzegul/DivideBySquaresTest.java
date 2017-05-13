package io.github.grzegul;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class DivideBySquaresTest {
	DivideBySquares dbs = new DivideBySquares();
	
	@Test
	public void divide_9Given_pass() {
		double expected = 0.012345679012345679;
		double actual = dbs.divide(9);
		
		System.out.println(expected);
		System.out.println(actual);
		assertEquals(expected, actual, 0.000000000000001);
		
	}
	@Test
	public void divide_99Given_pass() {
		double expected = 0.000102030405060709;
		double actual = dbs.divide(99);
		
		System.out.println(expected);
		System.out.println(actual);
		assertEquals(expected, actual, 0.000000000000001);
		
	}

}
