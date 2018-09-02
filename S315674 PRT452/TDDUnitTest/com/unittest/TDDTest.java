package com.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.unittest.CalculatorApp;

public class TDDTest {
	
CalculatorApp app = new CalculatorApp();
	

	
	@Test
	public void testGradient() {
		Object resultGradient=1.0;
		assertEquals(resultGradient, app.Gradient(1, 3, 6, 9));
	}

	@Test
	public void testDistance() {
		Object resultDistance=7.81;
		assertEquals(resultDistance, app.Distance(1, 3, 6, 9));
	}

	@Test
	public void testEquation() {
		Object resultEquation="-6.0x +5.0y =9.0";
		assertEquals(resultEquation, app.Equation(1, 3, 6, 9));
	}

	

}
