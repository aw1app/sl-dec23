package com.simpli.demo.dsa;

import java.util.Arrays;

public class MatrixMultiplicationDemo {

	public static void main(String[] args) {

		int[][] A = { { 3, -2, 5 }, { 3, 0, 4 } }; // 2 * 3 matrix

		int[][] B = { { 2, 3 }, { -9, 0 }, { 0, 4 } }; // 3 * 2 matrix

		System.out.println("Matrix A ");
		for (int[] x : A) {
			System.out.println(Arrays.toString(x));
		}
		;

		System.out.println("");

		System.out.println("Matrix B ");
		for (int[] x : B) {
			System.out.println(Arrays.toString(x));
		}
		;

		int[][] C = multiply(A, B);

		System.out.println("");

		System.out.println("Matrix C = A x B");
		for (int[] x : C) {
			System.out.println(Arrays.toString(x));
		}
		;

	}

	private static int[][] multiply(int[][] a, int[][] b) {
		
		int[][] resultMatrix = new int[a.length][b[0].length];
		
		
		for (int i=0; i<a.length; i++ ) { // for every row in A
			
			for (int j=0; j<b[0].length;j++) { // for every col in B
				
				for (int k=0; k < a[0].length; k++)
					resultMatrix[i][j] = resultMatrix[i][j] + a[i][k] * b[k][j];
			}
			
		}
		
		
		return resultMatrix;
	}

}
