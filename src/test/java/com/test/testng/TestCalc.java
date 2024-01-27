package com.test.testng;

import org.testng.annotations.Test;

import com.calc.LibMath;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class TestCalc {
  @Test
  public void testAdd() {
	  LibMath lib = new LibMath();
	  int num1 = 10;
	  int num2 = 20;
	  int actSum = lib.Sum(num1, num2);
	  int expSum = 30;
	  System.out.println("SUm is "+actSum);
	  assertEquals(actSum, expSum);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");
  }

}
