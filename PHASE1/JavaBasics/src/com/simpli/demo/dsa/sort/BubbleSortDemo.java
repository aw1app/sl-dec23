package com.simpli.demo.dsa.sort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);

			}

		}

	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		
	}

}
