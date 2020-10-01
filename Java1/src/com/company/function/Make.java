package com.company.function;
import java.util.Scanner;
public class Make { 
public static	void  factorial(long f) { 
		int fact=1;
		for(int i=1;i<=f;i++) { 
			fact=fact*i;
		} 
	System.out.print("Factorial of "+f+" is "+fact);
	}

	public static void main(String[] args) {
           try (Scanner s = new Scanner (System.in)) {
			System.out.println("Enter the number less than 19");
			   long n=s.nextLong(); 
			    Make.factorial(n);
		}        
 
	}

}
