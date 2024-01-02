package com.simpli.demo.dsa;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int[] arr = {4 , 14, 3, 35, 23, 24};
		
		int k=4;
		
		int n =arr.length;
		// For situation when k>n: Rotating an array by k positions is same as
		// rotating it by k%n
		k=k%n; 
		
		System.out.println("Given array: "+ Arrays.toString(arr));
		
		int[] result=new int[arr.length]; 
		
		for(int i=0; i<k; i++) {
			result[i]=arr[n-k+i];
		};
		
		//System.out.println("Intermediate Result array: "+ Arrays.toString(result));
		
		int m=0;
		for(int j=k;j<n;j++)
			result[j]=arr[m++];
		
		System.out.println("Result array: "+ Arrays.toString(result));

	}

}
