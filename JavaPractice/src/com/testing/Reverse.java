package com.testing;

public class Reverse {

	public static void main(String[] args) {
		String s= "NewJava";
		System.out.println("Length is "+s.length());
		System.out.println("Lets reverse");
		int m = s.length()-1;
		for(int i=m;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}