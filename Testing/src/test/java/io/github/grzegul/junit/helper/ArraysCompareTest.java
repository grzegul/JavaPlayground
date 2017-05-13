package io.github.grzegul.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort() {
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	@Test(expected = NullPointerException.class)
	public void testNullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	@Test(timeout = 50)
	public void testSortPerformance() {
		int[] array = {12,23,4};
		for(int i=0; i<1000000; i++){
			array[0] = i;
			Arrays.sort(array);
		}
		
	}
}
