package classandmethods;

import java.util.Scanner;

public class Calculator {

	//blueprint
	
	//non return methods
	public void add(int a, int b) {
		int total;
		total = a + b;
		System.out.println(total);
	}
	
	public void sub() {
		int a = 10;
		int b = 5;
		
		int total;
		
		total = a - b;
		
	}
	
	//return method
	public int div(int a, int b) {
		
		int total;
		
		total = a / b;
		return total;
	}
	
	public String typeYourName(String name) {
		return name;
	}
	
	public double mul(double a, double b) {
		double total;
		total = a * b;
		return total;
	}
	
	public boolean married() {
		System.out.println("are you married?");
		boolean married = true;
		return married;
	}
	
	
}