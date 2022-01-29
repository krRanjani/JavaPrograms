package com.testing;

import java.util.Scanner;

public class Swapping {
	
	static void swap(int a,int b)
	{
		a=a+b; 
		b=a-b; 
		a=a-b; 
		System.out.println("value of a: "+a+ " and b:"+b);
	}

	public static void main(String[] args) {

		int n1,n2;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter 2 numbers a and b to swap");
		n1= in.nextInt();
		n2 = in.nextInt();
		
		swap(n1,n2);
		in.close();
	}

}