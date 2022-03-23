package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumStringTokenizer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int s=0;
	StringTokenizer st=new StringTokenizer(str);
	while(st.hasMoreTokens())
	{
		String d=st.nextToken(",");
		int r=Integer.parseInt(d);
		System.out.println(r);
		s=s+r;
	}
	System.out.println(s);
	
	sc.close();
}
}
