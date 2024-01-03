package com.simpli.demo.dsa.search;

public class LineraSearchDemo {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 23, 40, 50, 77 };

		int key = 40;

		int positionOfKey = doLinearSearch(arr, key);

		if (positionOfKey != -1)
			System.out.println("Found the key " + key + " at position " + positionOfKey);
		else
			System.out.println("Key " + key + " not found ");

		key = 41;

		positionOfKey = doLinearSearch(arr, key);

		if (positionOfKey != -1)
			System.out.println("Found the key " + key + " at position " + positionOfKey);
		else
			System.out.println("Key " + key + " not found ");

	}

	private static int doLinearSearch(int[] arr, int key) {
		int positionOfKey = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				positionOfKey = i;
				break;
			}
		}

		return positionOfKey;

	}

}
