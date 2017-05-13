import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class KalkulatorTest {
	protected int val0, val1;
	protected Kalkulator kalk = new Kalkulator(val0, val1);
	
	@Before
	public void setUp() throws Exception {
		val0 = 0;
		val1 = 1;
				
	}
	@Test
	public void testPositive() {
		int result = val0 + val1;
		assertEquals(result, kalk.suma(val0, val1));
	}
	@Test
	public void testNegative() {
		int result = -val0 - val1;
		assertEquals(result, kalk.suma(-val0, -val1));
	}
	@Test
	public void testNegPos() {
		int result = -val0 + val1;
		assertEquals(result, kalk.suma(-val0, +val1));
	}
	@Test
	public void testPosNeg() {
		int result = val0 - val1;
		assertEquals(result, kalk.suma(val0, -val1));
	}
	
	
}
