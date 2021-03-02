import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SearchTest {
	
	int[] arr1 = {1,2,3,4,5};
	int[] arr2 = {2,4,10,12};
	int[] arr3 = {10,77,90,200,500};
	int[] arr4 = {1,2,3,40,44,97,99};
	
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBinarySearch() {
		Search searchOps = new Search();

		assertEquals(0,searchOps.binarySearch(arr1,0,arr1.length-1, 1));
		assertEquals(2,searchOps.binarySearch(arr2,0,arr2.length-1, 10));
		assertEquals(3,searchOps.binarySearch(arr3,0,arr3.length-1, 200));
		assertEquals(-1,searchOps.binarySearch(arr4,0,arr4.length-1, 100));
		
	}

	@Test
	public void testLinearSearch() {
		Search searchOps = new Search();

		assertEquals(0,searchOps.linearSearch(arr1,arr1.length-1,0, 1));
		assertEquals(2,searchOps.linearSearch(arr2,arr2.length-1,0, 10));
		assertEquals(3,searchOps.linearSearch(arr3,arr3.length-1,0, 200));
		assertEquals(-1,searchOps.linearSearch(arr4,arr4.length-1,0, 100));
	}

}
