package ant_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addtest() {
		System.out.println("test calculatrice.add");                      
	      Calc calculatrice = new Calc(); 
	      int r = calculatrice.add(10, 10);
	      assertEquals(20, r, 0); 

	}

	@Test
	public void addtest2() {
		System.out.println("test calculatrice.add");                      
	      Calc calculatrice = new Calc(); 
	      int r = calculatrice.add(0, 0);
	      assertEquals(0, r); 

	}
}
