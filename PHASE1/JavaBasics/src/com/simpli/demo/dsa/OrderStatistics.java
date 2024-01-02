package com.simpli.demo.dsa;

import java.util.Arrays;

public class OrderStatistics {

	public static void main(String[] args) {
		int[] arr = { 4, 21, 23, 18, 10, 24, 35, 14, 5, 9 };

		int k = 2;

		int n = arr.length;

		System.out.println("Given array: " + Arrays.toString(arr));

		int result = findKtheSmallest(arr, k);

		System.out.println(k + "th smallest : " + result);

	}

	private static int findKtheSmallest(int[] arr, int k) {

		if (arr == null)
			throw new IllegalArgumentException();

		return quickSelect(arr, 0, arr.length - 1, k - 1);

	}

	private static int quickSelect(int[] arr, int left, int right, int k) {

		// Base case
		if (left == right)
			return arr[left];

		// The partition has more than 1 elements
		// so we have to repeat the partitioning process.

		int pivotIndex = partition(arr, left, right);

		if (pivotIndex == k)
			return arr[pivotIndex];

		if (pivotIndex < k)
			return quickSelect(arr, pivotIndex + 1, right, k);

		else
			return quickSelect(arr, 0, pivotIndex - 1, k);

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
