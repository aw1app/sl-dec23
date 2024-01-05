package com.simpli.demo.dsa.sort;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 77, 23, 21, 50, 3, 17 };

		System.out.println("Given array: " + Arrays.toString(arr));

		selectionSort(arr);

		System.out.println("Sorted array: " + Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int minIndex = i;
			int minIndexValue = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < minIndexValue) {
					minIndex = j;
					minIndexValue = arr[j];
				}
			}

			swap(arr, i, minIndex);
		}

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;

	}

}
