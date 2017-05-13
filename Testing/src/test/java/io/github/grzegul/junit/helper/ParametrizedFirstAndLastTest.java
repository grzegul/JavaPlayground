package io.github.grzegul.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizedFirstAndLastTest {
	StringHelper s = new StringHelper();
	private String input;
	private boolean expectedOutput;
	
	
	public ParametrizedFirstAndLastTest(String input, Boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> testConditions(){
		Object [][] expectedOutputs = {
				{"ABCD", false},
				{"ABAB", true},
				{"AB", true},
				{"A", false}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		System.out.println(input);
		assertEquals(expectedOutput, s.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	
}
