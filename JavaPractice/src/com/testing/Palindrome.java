package com.testing;

import java.util.Scanner;

public class Palindrome {

	static void checkpalindrome(String str) 
	{
		String r="",s=str;
		int len= s.length();
		for(int i=len-1;i>=0;i--)
		{
			r =r+ s.charAt(i);
		}
		System.out.println("Original string is "+s);
		System.out.println("Reverse string is "+r);
		
		if(r.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome");
			}
		
			else 
				System.out.println("Non-palindrome");
		}

	public static void main(String[] args) {

	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input for which the palindrome check is needed");
		 if(in.hasNextLine())
		{
			String txt = in.nextLine();
			checkpalindrome(txt);
		}
	
		in.close();
	}

}