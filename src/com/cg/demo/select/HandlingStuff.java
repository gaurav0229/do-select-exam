package com.cg.demo.select;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
  //Implement Activity class here..
  String string1;
	String string2;
	String operator;

	Activity() {
		// Dfault
	}

	Activity(String string1, String string2, String operator) {
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}



public class HandlingStuff {
  //Implement the two function given in description in here...
  public String handleException(Activity a) {

		String message = "";
		try {
			if (a.string1.isEmpty() && a.string2.isEmpty()) {
				throw new NullPointerException("Null values found");
			} else if (a.operator == "+" && a.operator == "-") {
				return message = a.operator;
			} else {
				message = "No Exception Found";
			}
		} catch (NullPointerException e) {
			message = "Null values found";
		}
		return message;
	}

	public String doOperation(Activity a) {
		String opr = a.operator;
		String s1 = a.string1;
		String s2 = a.string2;
		String result = "";
		switch (opr) {
		case "+":
			result = s1 + s2;
			break;
		case "-":
			result = s1.replaceAll(s2, "");
			break;
		}
		return result;
	}
  
	public static void main(String args[] ) throws Exception {
    //Write your own main to check the program...
    Activity a = new Activity("helloworld", "world", "*");
		HandlingStuff s = new HandlingStuff();
		System.out.println(s.handleException(a));
		System.out.println(s.doOperation(a));
	}
}
