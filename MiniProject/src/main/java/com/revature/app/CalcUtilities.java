
package com.revature.app;

import java.util.ArrayList;

public class CalcUtilities {

	public CalcUtilities() {}
	
	public double calculate(ArrayList<String> input) {
		double result = 0;								
		double num1 = Double.parseDouble(input.get(0));	// params passed reassigned for 
		char operator = input.get(1).charAt(0);			// readability
		double num2 = Double.parseDouble(input.get(2));	// all are string needed to get usable
													// input
			switch (operator) {						// switch case to test equality of math
				case '+':							// operator
					result = (num1 + num2); 		// addition 
						break;
				case '-':
					result = (num1 - num2); 		// subtraction 
						break;
				case '/':
					result = ( num1/ num2);			// division.. no divide by zero 
						break;						//issue exists by this point
				case '*':							// handled issue with if else in main
					result = ( num1 * num2); 		// multiplication
						break;
				default:							// to be used for invalid operator
						break;						// but took care of on HTML select element
			}
			
	return result;								// return result
	}
}
