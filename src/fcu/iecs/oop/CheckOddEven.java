package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number:");
		int num = scanner.nextInt();
		
		if(num%2==1){
			System.out.println("The interger is odd number.");
		}
		else
			System.out.println("The interger is even number.");		
	}

}
