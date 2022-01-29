package com.testing;

public class Prime {

	public static void main(String[] args) {

		int n=17,i;
		if(n==1)
		{
			System.out.println("Smallest prime no is 2");
		}
		for (i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not ptime");
				break;
			}
			
		} if(n==i)
		{
			System.out.println("Prime");
		}
	}

}