package lab1;

import java.util.*;

public class ex3 {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		n=sc.nextInt();
		int a=1,b=1;
		switch(ch)
		{
		case 1: System.out.println(ex3.fiborecursive(n));
		break;
		case 2: ex3.fibononrecursive(n,a,b);
		break;
		default: System.out.println("Invalid");
		}
		sc.close();
	}
	public static int fiborecursive(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fiborecursive(n-1)+fiborecursive(n-2);
		}
	}
	public static void fibononrecursive(int n,int a,int b)
	{
		int s=0;
		for(int i=0;i<n-2;i++)
		{
		   s=a+b;
		   a=b;
		   b=s;
		}
		 System.out.println(s);
	}
}
