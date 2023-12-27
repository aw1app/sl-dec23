package com.simpli.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String text = "I am staying at door no 34. You can call me on 900007654 before 3 pm.";
		System.out.println("TEXT : " + text);

		String myRegex = "\\d+";
		Pattern pattern = Pattern.compile(myRegex);

		Matcher matcher = pattern.matcher(text);

		int counter = 0;
		while (matcher.find()) {
			System.out.printf("\n Found a match at starting at %s and ending at %s : ", matcher.start(), matcher.end());
			System.out.println(text.substring(matcher.start(), matcher.end()));
			counter++;
		}
		;

		System.out.printf("\n Totally %s matches were found for the given pattern %s \n", counter, myRegex);

		// Example 2
		System.out.println("Example 2:");
		String myRegex2 = "3 pm$";
		Pattern pattern2 = Pattern.compile(myRegex2);

		Matcher matcher2 = pattern2.matcher(text);
		counter = 0;
		while (matcher2.find()) {
			System.out.printf("\n Found a match at starting at %s and ending at %s : ", matcher2.start(),
					matcher2.end());
			System.out.println(text.substring(matcher2.start(), matcher2.end()));
			counter++;
		}
		;

		System.out.printf("\n Totally %s matches were found for the given pattern %s \n", counter, myRegex2);

		// // Email matching
		System.out.printf("\n Email Validity check");
		String email = "aksingh@yahoo.co.in";
		String emailRegex = "^[a-zA-Z0-9_.-]+@(.+)$";

		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher emailMatcher = emailPattern.matcher(email);

		if (emailMatcher.matches())
			System.out.printf("\n The given %s is a valid email",email);
		else
			System.out.printf("\n The given %s is a NOT valid email",email);

	}

}
