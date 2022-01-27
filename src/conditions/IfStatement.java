package conditions;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		int a = 0;
		
		if (a > 0) {
			System.out.println("this number is positive");
		}else if(a == 0) {
			System.out.println("this number equals to 0");
		}
		else {
			System.out.println("this number is negative");
		}
		
		//logical operator symbols: ==, !=, >, <, <=, >=, +, -, /, *, &, &&, ||, |, %
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number: ");
		int b = sc.nextInt();
		
		if (b % 2 == 0) {
			System.out.println("this number is even");
		}else {
			System.out.println("this number is odd");
		}
		
		

	}

}
