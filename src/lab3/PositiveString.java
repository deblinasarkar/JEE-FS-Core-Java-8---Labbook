package lab3;

import java.util.Scanner;

public class PositiveString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	boolean res=positiveString(str);
	System.out.println(res);
	sc.close();
	
}
public static boolean positiveString(String str)
{
	boolean res = false;
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length-1;i++)
	{
		if((int)arr[i]<(int)arr[i+1])
		{
			res=true;
		}
		else
			res=false;
	}
	return res;
	
}
}
