package com.arrays;

public class Twodimensionalarray {

	public static void main(String[] args) {

		int a[][] = new int [4][2];
		a[0][0] =2;
		a[0][1] =1;
		a[1][0] =56;
		a[1][1] =23;
		a[2][0] =32;
		a[2][1] =12;
		a[3][0]=14;
		a[3][1] =15;
		
		System.out.println("no of rows:"+a.length);
		System.out.println("no of columns:"+a[0].length);
		for(int i=0;i<a.length;i++)  //rows  //0 1 2 3
		{
			for(int j=0;i<a[i].length;j++) //0 1 
			{
				System.out.println(a[i][j]);
			}
		}
	}

}

