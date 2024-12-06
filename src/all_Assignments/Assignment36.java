package all_Assignments;

import java.util.Arrays;

public class Assignment36 {
	
	
	//Assignmnet 36 In given String find how many are alphabets,how many are special character,
	                             //how many are numeric,	how many are Spaces
	public static void main(String[] args) {
		String s1="Rohit Patil";
		char[] c1=s1.toCharArray();
		System.out.println(c1);
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
		boolean b1=	Character.isLetter(c1[0]);
		System.out.println(b1);
		}
		
		String s2="rohit patil 770983  8486";
		int total_no_of_alphabets=0;
		char[] c2=s2.toCharArray();
		/*for(int i=0;i<s2.length();i++)
		{
			boolean b2=Character.isLetter(c2[i]);
			System.out.println(b2);
			
			if(b2==true)
			{
				total_no_of_alphabets++;
			}
			System.out.println(total_no_of_alphabets);
		}*/
		int total_space=0;
		for (int i=0;i<s2.length();i++)
		{
			boolean b2=Character.isWhitespace(c2[i]);
			System.out.println(b2);
			
			if(b2==true) 
			{
				total_space++;
			}
			System.out.println(total_space);
		}
		
		
		
		
	}

}
