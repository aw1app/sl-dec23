package com.simpli.demo.dsa.search;

import java.util.Arrays;

public class ExponentialSearchDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 23, 30, 40, 50, 77, 79, 81, 85 };

		int key = 400;

		System.out.println("Given array: " + Arrays.toString(arr));

		int indexOfTheKey = exponentialSearch(arr, key);

		if (indexOfTheKey != -1)
			System.out.println("Key " + key + " was found in the array at index " + indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");
		
		key = 79;
		indexOfTheKey = exponentialSearch(arr, key);

		if (indexOfTheKey != -1)
			System.out.println("Key " + key + " was found in the array at index " + indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");
		

	}

	private static int exponentialSearch(int[] arr, int key) {

		if (arr[0] == key)
			return 0;

		int i = 1;

		while (i < arr.length && arr[i] < key)
			i = i * 2;

		int upperBound = Math.min(arr.length, i);
		int lowerBound = i / 2;

		return binarySearch(arr, lowerBound, upperBound-1, key);

	}

	private static int binarySearch(int[] arr, int left, int right, int key) {

		while (left <= right) {

			int mid = (left + right) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return -1;
	}

}
