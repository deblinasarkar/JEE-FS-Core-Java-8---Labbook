package lab3;

import java.util.Scanner;

public class Consonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res=alterString(str);
		System.out.println(res);
		sc.close();
	}
public static String alterString(String str)
{
	String res="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'|| str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
		{
			res=res+str.charAt(i);
		}
		else if(str.charAt(i)=='Z')
		{
			res=res+'A';
		}
		else if(str.charAt(i)=='z')
		{
			res=res+'a';
		}
		else
		{
			res=res+(char)(str.charAt(i)+1);
		}
		
	}
	return res;
}
}
