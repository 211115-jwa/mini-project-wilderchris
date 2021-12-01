package com.revature.app;

public class FormatOut {
	
public String readOut(String s) {	// helps the output look better
	// cleaning up					// output will have 2 decimals and , separators
	return String.format("%,.2f",Double.parseDouble(s));
	}

public String html(String s) {	// helps take all of this html out of the main 
	// and organizing 
	if(s.equals("Front")) {		// output formatted html. just separated in front 
								// and back options
	return("<h2><center><div style=\"background: rgb(230, 233, 114); border: "
			+"2px solid rgb(151, 29, 203);\"><p style=\"margin: 15px; line-height: 1.5;\"><br><br>");
	}else 
		return ("<br><br></div> </p></center></h2>");
	

	
}
}