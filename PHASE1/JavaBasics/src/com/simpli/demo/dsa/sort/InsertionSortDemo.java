package com.simpli.demo.dsa.sort;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {
		
		for(int i=1; i< arr.length; i++) {
			
			int temp = arr[i];
			
			int j = i-1;
			
			// compare the value at i(temp) with all the previous index values.
			// and swap when it is less than.
			while(j>=0 && temp < arr[j] ) {
				
				//shifting
				arr[j+1] = arr[j];
				arr[j] = temp;
				
				j--;
			}			
			
		}		
		
	}
	
	
}
