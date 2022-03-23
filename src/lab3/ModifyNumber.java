package lab3;

import java.util.Scanner;

public class ModifyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int res=modifyNumber(n);
	System.out.println(res);;
	
	sc.close();
	
}
public static int modifyNumber(int n)
{
	String s=Integer.toString(n);
	char arr[]=s.toCharArray();
	StringBuffer sb=new StringBuffer();
	for(int i=0;i<arr.length-1;i++)
	{
		int num1=(int)arr[i];
		int num2=(int)arr[i+1];
		if(num1-num2>0)
			sb.append(num1-num2);
		else if(num2-num1>0)
			sb.append(num2-num1);
		
	}
	sb.append(s.charAt(s.length()-1));
	String res=sb.toString();
	int r=Integer.valueOf(res);
	
	return r;
	
}
}
