package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=getSorted(a);
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		sc.close();
		
	}

	public static int[] getSorted(int[] a) {
		ArrayList <Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			String s1=Integer.toString(a[i]);
			StringBuffer sb=new StringBuffer(s1);
			sb.reverse();
			ls.add(Integer.parseInt(sb.toString()));
			
		}
		Collections.sort(ls);
		Object arr1[]=ls.toArray();
		int[] arr2=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			arr2[i]=(int)arr1[i];
		}
		return arr2;
	}
}
