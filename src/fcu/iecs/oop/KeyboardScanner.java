package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {


	public static void main(String[] args) {
		
		System.out.print("Enter a interger:");
		Scanner scanner = new Scanner(System.in);
		int interger = scanner.nextInt();
		
		System.out.print("Enter a float point number:");
		float float_num = scanner.nextFloat();
		
		System.out.print("Enter your name:");
		String name = scanner.next();
		
		System.out.printf("Hi %s ,the multiplication of %d and %.5f",name,interger,float_num);
		
		float total = interger * float_num;
		System.out.printf("is %e",total);
	}

}
