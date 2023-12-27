package com.simpli.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String text = "I am staying at door no 34. You can call me on 900007654 before 3 pm.";
		
		String myRegex = "\\d+";
		Pattern pattern = Pattern.compile(myRegex);
		
		Matcher matcher = pattern.matcher(text);
		
		int counter=0;
		while(matcher.find()) {
			System.out.printf("\n Found a match at starting at %s and ending at %s : ", matcher.start(), matcher.end());
			System.out.println(text.substring(matcher.start(), matcher.end()));
			counter++;
		};
		
		System.out.printf("\n Totally %s matches were found for the given pattern %s \n",counter, myRegex);

	}

}
