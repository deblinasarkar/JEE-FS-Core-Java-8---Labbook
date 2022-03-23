package lab9;

import java.util.Scanner;

//Write a method to calculate factorial of a number.
//Test this method using method reference feature. 
interface calcuFahre{
	void cal(int n);
}
public class Ex5 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	calcuFahre c=Ex5::calculator;
	c.cal(n);
	
	sc.close();
}
public static void calculator(int n)
{
	int s=1;
	for(int i=1;i<=n;i++)
	{
		s=s*i;
	}
	System.out.println(s);
}
}
