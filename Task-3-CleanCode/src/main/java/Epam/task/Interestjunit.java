package Epam.task;

import org.junit.Test;

import junit.*;
import junit.framework.TestCase;

public class Interestjunit extends TestCase {
	Interest cal=new Interest();
	@Test
	public void testsimpleInterest()
	{
	assertEquals(7950.0, cal.simpleInterest(7500, 2, 3));

	}
	@Test
	public void testcompoundInterest()
	{
	assertEquals(304.5,cal.compoundInterest(5000, 2, 3));
	}
}
