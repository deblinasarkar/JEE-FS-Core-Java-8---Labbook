package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println(getSecondSmallest(a));
	sc.close();
	
}

public static int getSecondSmallest(int[] a) {
	List<Integer> list=new ArrayList<Integer>();
	for(Integer i:a)
	{
		list.add(i);
	}
	Collections.sort(list);
	return(list.get(1));
	
}
}
