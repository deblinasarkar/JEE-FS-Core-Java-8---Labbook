package lab9;

import java.util.Scanner;

//Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string.  For ex.,
//if input is “CG”, then expected output is “C G”.
interface space{
	String spa(String str);
}
public class Ex2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	space s= (String r)->{
		return r.replaceAll("\\B", " "); 
		
	};
	System.out.println(s.spa(str));
	sc.close();
}
}
