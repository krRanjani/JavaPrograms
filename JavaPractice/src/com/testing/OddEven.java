package com.testing;

import java.util.Scanner;

public class OddEven {

	static void check(int num)
	{
		int a = num;
		if(a%2==0)
		{
			System.out.println(a+ " is an even number");
		}
			else
		{
				System.out.println(a+ " is an odd number" );
		}
	}
	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if its odd or even: ");
		n = s.nextInt();
		check(n);
		s.close();
	}

}