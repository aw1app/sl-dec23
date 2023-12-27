package com.simpli.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println("ExceptionHandlingDemo : ");

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the plot size  ");
		int plotSize = sc.nextInt();

		System.out.println(" In to how pieces you want divide this plot. Please do not type 0.  ");
		int noOfPiecesToDivide = sc.nextInt();

		if (noOfPiecesToDivide == 0)
			System.out.println("Zero was entered . so won't calculate the plotsize.");

		System.out.println(" So here size of each plot after division " + plotSize / noOfPiecesToDivide);

		

		String myFile = "C:\\Temp\\log.txt";
		try {
			FileReader f = new FileReader(myFile);
		} catch (FileNotFoundException e) {
			System.out.printf("Given file %s not found in the system.  \n"
					+ " Make sure it is in the said location and then retry\\n",myFile);
		}
		
		System.out.println(" Thank you ");

	}

}
