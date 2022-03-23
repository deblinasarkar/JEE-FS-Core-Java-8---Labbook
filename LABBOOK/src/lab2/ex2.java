package lab2;
import java.util.*;
public class ex2 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	String[] s=new String[n];
	for(int i=0;i<n;i++)
	{
		s[i]=sc.next();
	}
	sortStrings(s);
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	sc.close();
}

public static void sortStrings(String[] s)
{
	int i,j;
	for(i=0;i<s.length-1;i++)
	{
		for(j=i+1;j<s.length;j++)
		{
			if(s[i].compareTo(s[j])>0)
				{
					String t=s[i];
					s[i]=s[j];
					s[j]=t;
				}

		}
	}
	for(i=0;i<s.length/2;i++)
	{
		s[i]=s[i].toUpperCase();
	}
	for(i=s.length/2;i<s.length;i++)
	{
		s[i]=s[i].toLowerCase();
	}
}
}