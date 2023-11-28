package com.king.assignment2;

import java.util.Scanner;
import java.util.regex.Pattern;

import StringUtils.MathFunctions;

/**
 * Simple calculator utilizing a reusable math library
 * Library GitHub: https://github.com/Hoofnuts/SENG560_Project1
 * @author Jared King
 */
public class Calculator {

	public static void main(String[] args) {
		
		// Declare Scanner and variables
		Scanner sc = new Scanner(System.in);
		String num1, num2, output = "";
		char operator;
		
		// Get numbers and operator
		System.out.println("Calculator");
		System.out.println("Enter first number");
		num1 = sc.next();
		sc.nextLine(); // Clear new line from buffer
		System.out.println("Enter second number");
		num2 = sc.next();
		sc.nextLine(); // Clear new line from buffer
		System.out.println("Enter the operator (+, -, *, /)");
		operator = sc.next().charAt(0);
		sc.nextLine(); // Clear new line from buffer
		
		// Check numbers
		if(!isNumber(num1) || !isNumber(num2)) {
			System.out.println("Invalid number input");
			System.exit(1);
		}
		//Check operator
		if (!isOperator(operator)) {
			System.out.println("Invalid operator input");
			System.exit(2);
		}
		
		// If int, do int calculations, otherwise use double
		if (isInt(num1) && isInt(num2)) {
			switch (operator) {
				case '+':
					output = MathFunctions.addInts(num1, num2);
					break;
				case '-':
					output = MathFunctions.subInts(num1, num2);
					break;
				case '*':
					output = MathFunctions.mulInts(num1, num2);
					break;
				case '/':
					output = MathFunctions.divInts(num1, num2);
					break;
			}
		}
		else {
			switch (operator) {
				case '+':
					output = MathFunctions.addDoubles(num1, num2);
					break;
				case '-':
					output = MathFunctions.subDoubles(num1, num2);
					break;
				case '*':
					output = MathFunctions.mulDoubles(num1, num2);
					break;
				case '/':
					output = MathFunctions.divDoubles(num1, num2);
					break;
			}
		}
		
		System.out.println(output);
		sc.close();
	}
	
	private static boolean isInt(String num) {
		boolean isInt = true;
		try {
			Integer.parseInt(num);
		}
		catch (Exception e) {
			isInt = false;
		}
		
		return isInt;
	}
	
	// Regex check to see if String is numeric
	private static boolean isNumber(String num) {
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	    if (num == null) {
	        return false; 
	    }
	    return pattern.matcher(num).matches();
	}
	
	// Quick compare checks for the operator
	private static boolean isOperator(char op) {
		if (op == '+')
			return true;
		if (op == '-')
			return true;
		if (op == '*')
			return true;
		if (op == '/')
			return true;
		return false;
	}
}
