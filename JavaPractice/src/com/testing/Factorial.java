package com.testing;

import java.util.Scanner;

public class Factorial {

static void findfactorial(int f)
{
	int fact=1;
	for (int j=f;j>0;j--)
	{
		fact*=j;
		
	}
	System.out.println("Factorial of "+f+" is "+ fact);	
}
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the number for which factorial is needed");
	int n = in.nextInt();
	findfactorial(n);
	
	in.close();
}

}