package com.datatypes;

public class operators {

	public static void main(String[] args) {

		
		int a=20;
		int b=50;
		//arthimatic operators
		System.out.println(a+b);
		System.out.println("the value of and b is:"+(a-b));
		System.out.println(a*b);
		System.out.println(a%b);
		
	
		System.out.println("relational operators");
		System.out.println(b==a);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		System.out.println();
		System.out.println("logical operators");
		boolean x= false;
		boolean y= true;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		//incremental operators 
		a++;
		b--;
				
		System.out.println(a++);
		System.out.println(b--);
	}

}
