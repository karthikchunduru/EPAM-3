package Epam.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructioncostTest {
	Constructioncost cal=new Constructioncost();
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		assertEquals(1200.0, cal.caluculateCost(1, 1.2, false));
		
	}

}
