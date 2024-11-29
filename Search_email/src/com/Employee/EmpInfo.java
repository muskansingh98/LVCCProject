package com.Employee;

import java.util.ArrayList;
import java.util.Scanner;

class EmpInfo {
	public static void main(String[] args) {
		
		ArrayList<String> email = new ArrayList<String>();
		
		email.add("muskan@email.com");
		email.add("khushi@email.com");
		email.add("hussey@email.com");
		email.add("sejal@email.com");
		email.add("geeta@email.com");
		
		String search_element = null;
		System.out.println("Enter the email to search: ");
		Scanner sc = new Scanner(System.in);
		search_element = sc.nextLine();
		
		if(search_element == null) {
			System.out.println("You haven't entered an email");
			return;
		}
		
		for(int i=0; i<email.size(); i++) {
			System.out.println(email.get(i));
			if(email.contains(search_element)) {
				System.out.println(search_element+"'s email Id has Found");
				break;
			}
			else {
				System.out.println("This email has not existed");
			}
		}
		
		
	}
	
	

}
