import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class KnightTourTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSolveKT() {

		assertEquals(true,KnightTour.solveKT(17));
		assertEquals(true,KnightTour.solveKT(10));
		assertEquals(true,KnightTour.solveKT(6));
		assertEquals(true,KnightTour.solveKT(25));
		assertEquals(true,KnightTour.solveKT(40));
	}

}
