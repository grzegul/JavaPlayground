package paczka;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
	public void testGo() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str);
		assertEquals("Junit is working fine",str);
		assertEquals("zzz",str);
		
		String str2 = "xxx";
		assertEquals("xxx",str2);
		assertEquals("zzz",str2);
	}
}
