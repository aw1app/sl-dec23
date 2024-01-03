package com.simpli.demo.dsa.search;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 23, 30, 40, 50, 77 };

		int key = 40;

		System.out.println("Given array: " + Arrays.toString(arr));

		int indexOfTheKey = binarySearch(arr, key);

		if (indexOfTheKey != -1)
			System.out.println("Key " + key + " was found in the array at index " + indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");
		
		key = 41;
		indexOfTheKey = binarySearch(arr, key);

		if (indexOfTheKey != -1)
			System.out.println("Key " + key + " was found in the array at index " + indexOfTheKey);
		else
			System.out.println("Key " + key + " was not found in the array");

	}

	private static int binarySearch(int[] arr, int key) {

		int left = 0;
		int right = arr.length - 1;

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
