package com.revature.app;

import java.util.ArrayList;

import io.javalin.Javalin;

public class CalculatorApp {
	
	public static void main(String[] args) {
		
		ArrayList<String> input = new ArrayList<String>(4);// ArrayList for holding my main variables
		
		Javalin app = Javalin.create();						//instantiate javalin app object
		app.start();										// and start it, default port 8080

		app.get("/Calculator", ctx -> {						// had post originally but since i'm not working with 
															// secure data I went with get 
			try {
			input.add(0,ctx.queryParam("num1"));	 	// read in 1st string into my ArrayList
			input.add(1,ctx.queryParam("operator"));	// 2nd input is for my calculator operator
			input.add(2,ctx.queryParam("num2"));		// 3rd string input, in a try catch for any invalid input
			}catch (Exception e) {								
				System.out.println("input error! only valid values please");
			}			
			
														// classes instantiated in objects utility and form
			CalcUtilities utility = new CalcUtilities();			
			FormatOut format = new FormatOut();
			
			if(input.get(0).equals("0") && input.get(1).equals("/")) {	// handling divide by zero issue before it becomes 
				ctx.html(format.html("Front")+"the answer of <br><hr>"		// a problem in calculation
				+format.readOut(input.get(0))+"   !Error! "
				+format.readOut(input.get(1))+" "+format.readOut(input.get(2))	// and formated output for message
				+"  =  "+"<br>  cannot divide by zero"+format.html("Back"));
				
			}else {
				
				input.add(3, String.valueOf(utility.calculate(input)));			// sends input to utility and method
																				// calculate to use the switch statement
				ctx.html(format.html("Front")+ "the answer is...   <br><br>" 	// return the answer and format an
				+format.readOut(input.get(0)) +" "+input.get(1) 				// html output with form and the methods
				+" "+format.readOut(input.get(2))+"  =  " 						// in FormatOut 
				+format.readOut(input.get(3)) + format.html("Back") );
			}
			
		});
		
	}

	
}
                 
 
