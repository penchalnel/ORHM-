package com.GRID;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewParameterTest {
	@Test
	   @Parameters("myName")
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	   }
}
