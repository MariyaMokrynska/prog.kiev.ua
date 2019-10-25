package com.gmail.mariyamokrynska1994;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input five digit number");
		
		int number = sc.nextInt(); // 13767
		
		int e = number % 10; // e = 7
		int d = number / 10 % 10; // d = 6
		int c = number / 100 % 10; // c = 7
		int b = number / 1000 % 10; // b = 3
		int a = number / 10000; // a = 1
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
