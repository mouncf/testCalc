package ant_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultTest {

	@Test
	public void test() {
		System.out.println("test calculatrice.add double");                      
	      Calc calculatrice = new Calc(); 
	      double r = calculatrice.add(10.0, 10.0);
	      assertEquals(20.0, r, 0); 
	}

}
