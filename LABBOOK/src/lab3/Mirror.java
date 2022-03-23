package lab3;

import java.util.Scanner;

public class Mirror {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String res=getImage(str);
	System.out.println(res);
	sc.close();
}
public static String getImage(String str)
{
	char ch;
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		ch=str.charAt(i);
		rev=rev+ch;
	}
	return str+"|"+rev;
}
}
