package com.simpli.demo.dsa;

import java.util.Arrays;

public class RangeQueriesDemo {
	static int[][] sparseTable;

	public static void main(String[] args) {
		int[] arr = { 4, 5, 9, 18, 10, 14, 21, 23 };

		buildSparseTable(arr);

//		for(int j=1; (1<<j) <= arr.length; j++) {
//			System.out.println("j="+(1<<j));
//			for (int i=0; i + (1 << j) - 1 <arr.length;i++ )
//				System.out.print("\t i="+ (i + (1 << j) - 1 ));
//			System.out.println("");	
//		}

		System.out.println("Sparse Table : ");
		for (int[] x : sparseTable) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println("");

		int i = 2;
		int j = 7;
		int result = rangeQuery(i, j);
		
		System.out.printf("Sum (%s,%s ) = %s \n" ,i, j, result );
		
		i = 4;
		j = 6;
		result = rangeQuery(i, j);
		
		System.out.printf("Sum (%s,%s ) = %s \n" ,i, j, result );
		
		i = 2;
		j = 5;
		result = rangeQuery(i, j);
		
		System.out.printf("Sum (%s,%s ) = %s \n " ,i, j, result );

	}

	private static int rangeQuery(int L, int R) {
		int result = 0;
		int k = (int) (Math.log(sparseTable.length) / Math.log(2)) + 1;
		
		for (int j = k; j >= 0; j--) {
			

			if (L + (1 << j) - 1 <= R) {
				
				result = result + sparseTable[L][j];
				L += 1 << j;
			}
			
		}
		
		return result;
	}

	private static void buildSparseTable(int[] arr) {

		int rows = arr.length;

		int cols = (int) (Math.log(rows) / Math.log(2)) + 1;

		sparseTable = new int[rows][cols];

		// First column values
		for (int i = 0; i < arr.length; i++)
			sparseTable[i][0] = arr[i];

		// Col 1 to cols
		for (int j = 1; (1 << j) <= arr.length; j++) {

			for (int i = 0; i + (1 << j) - 1 < arr.length; i++)

				sparseTable[i][j] = sparseTable[i][j - 1] + sparseTable[i + (1 << (j - 1))][j - 1];
		}

	}

}
