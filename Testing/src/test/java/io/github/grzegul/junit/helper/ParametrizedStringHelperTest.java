package io.github.grzegul.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametrizedStringHelperTest {
	StringHelper s = new StringHelper();
	private String input;
	private String expectedOutput;
	
	
	
	public ParametrizedStringHelperTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions(){
		String [][] expectedOutputs = {
				{"AACD", "CD"},
				{"ACD", "CD"},
				{"CDEF", "CDEF"},
				{"CDAA", "CDAA"}};
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPositions() {
		assertEquals(expectedOutput, s.truncateAInFirst2Positions(input));
	}
	
	
}
