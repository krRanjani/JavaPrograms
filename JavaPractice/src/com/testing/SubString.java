package com.testing;

public class SubString {
	
	static void subString(String str, String txt)
	{
		String a = str;
		String b= txt;
		//Using contains 
		boolean flag= a.contains(b);
		if(flag)
		{
			System.out.println(b+ " is a substring of a.");
		}
		else
				{System.out.println(b+ " is not a substring of a.");
		}
		//Using indexOf
		 int result = a.indexOf((b));
		 System.out.println("Inedx is "+result);
		    if(result == -1) {
		      System.out.println("'"+b+"'"  + " not is present in the string.");
		    }
		    else {
		      System.out.println("'"+b+"'" + " is present in the string.");
		    }
		
	}

	public static void main(String[] args) {
		subString("Naming is Convention is just a testing method","is");
	}

}