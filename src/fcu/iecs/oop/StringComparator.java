package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string:");
		String string1 = scanner.next();
		
		System.out.print("Enter the other string:");
		String string2 = scanner.next();
		
		if(string1.equalsIgnoreCase(string2)){
			System.out.println("The two strings are the same.");			
		}
		else
			System.out.println("The two strings aren't the same.");			
	}

}
