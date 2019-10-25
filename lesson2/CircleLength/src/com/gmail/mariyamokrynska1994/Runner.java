package com.gmail.mariyamokrynska1994;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input radius of circle");
		double r = sc.nextDouble();
		
		double l = 2.0*Math.PI*r;
		
		System.out.println("Length of circle equals " + l);
		
	}

}
