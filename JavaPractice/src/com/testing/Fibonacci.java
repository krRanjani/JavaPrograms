package com.testing;

import java.util.Scanner;

public class Fibonacci {
	
	static void printfibonacci(int m)
	{
		int a=0,b=0,c=1;
		for(int i=0;i<m;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+ " ");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		 if(in.hasNextLine())
		{
			int txt = in.nextInt();
			System.out.println("Fibonacci series");
			printfibonacci(txt);
		}
		 in.close();
	
	}

}