package lab3;

import java.util.Scanner;

public class DisplayStringInVariousForm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int c=0;
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		c++;
	}
	System.out.println(c);
	
	String word[]=str.split(" ");
	System.out.println(word.length);
	
	String sentence[]=str.split("[.]");
	System.out.println(sentence.length);
	sc.close();
}
}
