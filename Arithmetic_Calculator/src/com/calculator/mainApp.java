package com.calculator;

import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
			
		addition add =new addition();
		subtraction sub = new subtraction();
		multiplication mul = new multiplication();
		division div = new division();
		
		int x;//=add.Add();
		int y;//=sub.sub();
		int z;//=mul.mul();
		int t;//=div.div();
		
		int no;
		System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
		System.out.println("Please enter a number which perform you do: ");
		Scanner input1 = new Scanner(System.in);
		no = input1.nextInt();
		//input1.close();
		
		switch (no) {
		case 1:
			x=add.Add();
			System.out.println("Addition of numbers is "+x);
			//add.Add(a,b);
			break;
		case 2:
			y=sub.sub();
			System.out.println("Subtraction of numbers is "+y);
			break;
		case 3:
			z=mul.mul();
			System.out.println("Multiplication of numbers is "+z);
			break;
		case 4:
			t=div.div();
			System.out.println("Division of numbers is "+t);
			break;
		default:
			System.out.println("I am default , Unfortunately no case statement matched");
		
		}
				
	}

}

