package io.github.grzegul;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//ABCD=>BCD, AACD=>CD, BACD=>BCD, BBAA=>BBAA, AABAA=>BAA

@RunWith(Parameterized.class)
public class ARemoverTestFactorized {
	ARemover ar = new ARemover();;
	private String expected;
	private String actual;
	
	public ARemoverTestFactorized(String expected, String actual) {
		this.expected = expected;
		this.actual = actual;
	}

	
	@Parameters
	public static Collection<Object[]> testConditions(){
		Object [][] expectedOutputs = {
				{"BCD", "ABCD"},
				{"CD", "AACD"},
				{"BCD", "BACD"},
				{"BBAA", "BBAA"},
				{"BAA", "AABAA"}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testArray() {
		assertEquals(expected, ar.remove(actual));
	}
	@Test
	public void testFailure() {
		assertNotSame("AAA", ar.remove(""));
	}

}
