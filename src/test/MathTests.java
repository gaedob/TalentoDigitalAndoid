package test;

import org.junit.jupiter.Test; // gives us the @Test header
import static org.junit.jupiter.api.Assertions.assertEquals; // less typing :)


public class MathTests {
	@Test
	public void add_twoPlusTwo_returnsFour(){
	final int expected = 4;
	final int actual = Math.add(2, 2);
	assertEquals(“2+2 is 4”, actual, expected);
	}
}