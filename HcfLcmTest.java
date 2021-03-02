import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HcfLcmTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindLCM() {
		HcfLcm hlOps = new HcfLcm();
		assertEquals(170,hlOps.findLCM(10, 17));
		assertEquals(10,hlOps.findLCM(5, 10));
		assertEquals(12,hlOps.findLCM(4,6));
		assertEquals(50,hlOps.findLCM(10,25));
		assertEquals(40,hlOps.findLCM(10, 40));
	}

	@Test
	public void testFindHCF() {
		HcfLcm hlOps = new HcfLcm();
		assertEquals(1,hlOps.findHCF(10, 17));
		assertEquals(5,hlOps.findHCF(5, 10));
		assertEquals(2,hlOps.findHCF(4,6));
		assertEquals(5,hlOps.findHCF(10,25));
		assertEquals(10,hlOps.findHCF(10, 40));
	}

}
