package com.simpli.demo;

public class MultiDimArrayDemo {

	public static void main(String[] args) {

		int s [ ] [ ]=new int [2] [3];
		
		s[0] = new int[]{1,2,3};
		s[1] = new int[]{4,5,6};
		
		for (int i=0; i<s.length; i++ ) {
			
			for (int j=0; j<s[0].length; j++ ) {
				
				System.out.print(s[i][j] + "\t");
				
			};
			
			System.out.println();
		}

	}

}
