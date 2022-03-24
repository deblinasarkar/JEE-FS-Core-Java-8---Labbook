package maven.demo.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class ArrayListOps{
	public static List<Integer> makeArrayListInt(int n)
	   {
		   List<Integer> num=new ArrayList<Integer>(Collections.nCopies(n,0));
		   
		return num;


	   }
	
	public static List<Integer> reverseList(ArrayList<Integer> list)
	{
		Collections.reverse(list);
		return list;
		
	}

	public static List<Integer> changeList(ArrayList<Integer> list,int m,int n) {
	Collections.replaceAll(list, m,n);
		return list;
	}

	
}
public class set1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(ArrayListOps.makeArrayListInt(n));
	int d=sc.nextInt();
	Integer[] a=new Integer[d];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
	List<Integer> l1=ArrayListOps.reverseList(list);
	System.out.println(l1);
	int m=sc.nextInt();
	int s=sc.nextInt();
	List<Integer> l2=ArrayListOps.changeList(list,s,m);
	System.out.println(l2);
}

}
