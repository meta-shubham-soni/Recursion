import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NQueensTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSolveNQ() {
		NQueens nqOps = new NQueens();
		assertEquals(true,nqOps.solveNQ(17));
		assertEquals(true,nqOps.solveNQ(10));
		assertEquals(true,nqOps.solveNQ(6));
		assertEquals(true,nqOps.solveNQ(25));
		assertEquals(true,nqOps.solveNQ(40));
	}

}
