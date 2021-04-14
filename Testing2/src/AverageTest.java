import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AverageTest extends Average{
	
	private int[] list;

	@Before
	public void setUp() throws Exception {
		list = new int[0];
	}

	@After
	public void tearDown() throws Exception {
		list = null;
	}

	@Test
	public void testEmptyList() {
		int result = average(1,list);
		assertTrue("empty list", result == 0);
	}
	
	@Test
	public void testNegativeK() {
		list = new int[1];
		list[0] = 1;
		int result = average(-1, list);
		assertTrue("negative k", result ==0);
	}
	
	@Test
	public void testZeroK() {
		list = new int[1];
		list[0] = 1;
		int result = average(0, list);
		assertTrue("k is 0", result ==0);
	}
	
	@Test
	public void testSmallK() {
		list = new int[4];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 6;
		int result = average(3, list);
		assertTrue("k<size", result ==2);
	}
	
	@Test
	public void testLargeK() {
		list = new int[4];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 6;
		int result = average(5, list);
		assertTrue("k>size", result ==3);
	}
	
	@Test
	public void testSameK() {
		list = new int[4];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 6;
		int result = average(4, list);
		assertTrue("k == size", result ==3);
	}

}
