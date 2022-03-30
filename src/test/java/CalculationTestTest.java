import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTestTest {

	@BeforeAll
	public static void setUpBeforeClass() {
		System.out.println("before class");
	}
	
	@BeforeEach
	public void setUp() throws Exception{
		System.out.println("before");
	}
	
	@Test
	public void test() {
		assertEquals(4,Calculation.square(2));
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	
	@AfterAll
	
	public void tearDownAfterClass() throws Exception{
		System.out.println("After class");
	}

}
