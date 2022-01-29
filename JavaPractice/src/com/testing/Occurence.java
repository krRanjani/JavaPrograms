package com.testing;

public class Occurence {

	static int occur(String txt,char ch, int N)
	{
		int o=0;
		 for (int i=0;i<txt.length();i++)
		 {
			 if (txt.charAt(i)== ch)
					 {
				 		o+=1;
					 }
			 if (o==N)
				 return i;
	 
		 }
		 return -1;
		 
	}
	
	
	public static void main(String[] args) {
 
		System.out.println(occur("Helloworld",'e',2));
		System.out.println(occur("Pollution",'l',2));
		System.out.println(occur("Leader in Leader",'L',1));

	}
}

//https://www.geeksforgeeks.org/find-the-nth-occurrence-of-a-character-in-the-given-string/
//https://www.geeksforgeeks.org/smallest-odd-number-with-even-sum-of-digits-from-the-given-number-n/
