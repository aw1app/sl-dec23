package com.simpli.demo;

public class MultiDimArrayDemo {

	public static void main(String[] args) {

		int s[ ][ ]=new int [2] [3];
		
		s[0] = new int[]{1,2,3};
		s[1] = new int[]{4,5,6};
		
		for (int i=0; i<s.length; i++ ) {
			
			for (int j=0; j<s[0].length; j++ ) {
				
				System.out.print(s[i][j] + "\t");
				
			};
			
			System.out.println();
		};
		
		
		int r[ ][ ]=new int [2] [3];
		r[ 0][0 ] = 10;
		r[ 0][1 ] = 11;
		r[ 0][2 ] = 12;
		
		r[ 1][0 ] = 13;
		r[ 1][1 ] = 14;
		r[ 1][2 ] = 15;
		
		//challenge: Loop the above r array
		
//		for(int i=0;i<r.length;i++)
//			for(j=0;j<r[0].length;j++)
//			S.o.p(r[i][j];

	}

}
