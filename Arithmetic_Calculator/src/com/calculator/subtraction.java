package com.calculator;

import java.util.Scanner;

public class subtraction {
	
	int sub() {
		int a, b;
		System.out.println("Enter atleast 2 integer: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		return a-b;		
	}

}