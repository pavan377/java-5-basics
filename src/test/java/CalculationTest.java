import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void test() {
		assertEquals(5,Calculation.findMax(new int[] {1, 3, 5, 4}));
		assertEquals(9,Calculation.findMax(new int[] {2, 4, 6, 9}));
	}
	
	@Test
	void cubeTest() {
		assertEquals(27,Calculation.cube(3));
	}
	
	@Test
	void square() {
		assertEquals(4,Calculation.square(2));
	}
	
}
