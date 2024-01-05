package com.simpli.demo.dsa.sort;

import java.util.Arrays;

public class QuickSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		quickSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void quickSort(int[] arr) {

		if (arr == null)
			throw new IllegalArgumentException("Invalid input");

		quickSelect(arr, 0, arr.length - 1);

	}

	private static void quickSelect(int[] arr, int left, int right) {
		// If The partition has more than 1 element
		// we have to repeat the partitioning process.
		
		if (left < right) {
			
			int pivotIndex = partition(arr, left, right);

			quickSelect(arr, pivotIndex + 1, right);
			quickSelect(arr, left, pivotIndex - 1);
			
		}

	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivotValue = arr[right];
		int pivotIndex = left;

		for (int i = left; i < right; i++) {

			if (arr[i] < pivotValue) {
				swap(arr, i, pivotIndex);
				pivotIndex++;
			};
		}		

		swap(arr, right, pivotIndex);

		return pivotIndex;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
