package com.java;

public class ReverseaString {

	public static void main(String[] args) {


		String s = "selenium";
		int length =s.length();
		String reverse ="";
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse+s.charAt(i);
			//System.out.println(reverse);
		}
		
		System.out.println(reverse);
	}

}
