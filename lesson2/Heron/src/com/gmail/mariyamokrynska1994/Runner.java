package com.gmail.mariyamokrynska1994;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input sides of triangle");
		
		double a = sc.nextDouble(); // a=0.4
		double b = sc.nextDouble(); // b=0.3
		double c = sc.nextDouble(); // c=0.5

		double p = (a + b + c)/2.0; 
		// Heron's formula
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("Area equals " + area);
	}

}
