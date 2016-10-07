package fcu.iecs.oop;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		System.out.print("Enter a number 0~9:");

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		switch(num){
				
			case 1 :
				System.out.println("The number is ONE");
				break;
			case 2 :
				System.out.println("The number is TWO");
				break;
			case 3 :
				System.out.println("The number is THREE");
				break;
			case 4 :
				System.out.println("The number is FOUR");
				break;
			case 5 :
				System.out.println("The number is FIVE");
				break;
			case 6 :
				System.out.println("The number is SIX");
				break;
			case 7 :
				System.out.println("The number is SEVEN");
				break;
			case 8 :
				System.out.println("The number is EIGHT");
				break;
			case 9 :
				System.out.println("The number is NINE");
				break;
			default :
				System.out.print("The number is other");
				break;
		}
		
	}

}
