package com.unittest;

import java.util.Scanner;

import com.unittest.CalculatorApp;
import com.unittest.CalculatorApp;

public class CalculatorApp implements TestCalculator {

	public static void main(String[] args) {

	double x1,x2,y1,y2;
		
		CalculatorApp calApp =new CalculatorApp();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 value");
		x1 = scan.nextDouble();
		
		System.out.println("Enter y1 value");
		y1 = scan.nextDouble();
		
		System.out.println("Enter x2 value");
		x2 = scan.nextDouble();
		
		System.out.println("Enter y2 value");
		y2 = scan.nextDouble();
		scan.close();
		
		calApp.Distance(x1, y1, x2, y2);
		calApp.Equation(x1, y1, x2, y2);
		calApp.Gradient(x1, y1, x2, y2);

	}


	@Override
	public double Gradient(double x1, double y1, double x2, double y2) {
		// Calculate Gradient
			double gradient;
			gradient=Math.round(((y1-y2)/(x1-x2))*100)/100;
			System.out.println("\nGradient of Straight Line = "+gradient);
			return gradient;
	}

	@Override
	public double Distance(double x1, double y1, double x2, double y2) {
		// Calculate Distance 
		double distance;  
        distance =Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        distance =Math.round(distance* 100.0)/100.0;	// get the round number of distance
        System.out.println("\nDistance between two points = "+distance);
		return distance;
	}

	@Override
	public String Equation(double x1, double y1, double x2, double y2) {
		// Calculate Equation
		double x,y,c;
		 String equation;
		   x=Math.round((y2-y1)*100)/100;
		   y=Math.round((x2-x1)*100)/100;
		   c=Math.round(((y*y1)-(x*x1))*100)/100;
		   equation=-x+"x +"+y+"y ="+c;
		   System.out.println("\nEquation of Straight Line = "+equation);
		return equation;
	} 

}
