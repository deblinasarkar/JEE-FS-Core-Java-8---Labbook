package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ex2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char[] c=new char[n];
	for(int i=0;i<c.length;i++)
	{
		c[i]=sc.next().charAt(0);
	}
	System.out.println(countChars(c));
	sc.close();
}

public static Map<Character, Integer> countChars(char[] c) {
	HashMap<Character,Integer> h=new HashMap<Character,Integer>();
	for (int i = 0; i < c.length; i++) {
		if (h.containsKey(c[i])) {
			int count = h.get(c[i]);
			h.put(c[i], ++count);
		} else {
			h.put(c[i], 1);
		}
	}
	return h;
}
}
