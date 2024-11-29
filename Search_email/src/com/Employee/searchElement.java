package com.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class searchElement {
	
	public static void main(String[] args) {
		ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("muskan@email.com");
        emailID.add("khushi@email.com");
        emailID.add("hussey@email.com");
        emailID.add("sejal@email.com");
        emailID.add("geeta@email.com");
        emailID.add("krishn@email.com");
        emailID.add("nikita@email.com");
        
         // new code
         String searchElement = null;
         System.out.println("Enter the email to search");
         Scanner sc = new Scanner(System.in);
         searchElement = sc.nextLine();
         
         
         if(emailID.contains(searchElement)){
        	    System.out.println(searchElement+"'s email Id has Found");
        	}
        	else{
        	    System.out.println("This email has not existed");
        	}
          
	}

}
