package lab2;
import java.util.*;

public class ex1 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n<0)
	{
		System.out.println("inavlid input");
	}
	else
	{
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int o=ex1.getSecondSmallest(n,a);
		System.out.println(o);
	}
	sc.close();
}
public static int getSecondSmallest(int n,int[] a)
{
	int i;
	for(i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	return a[1];
}
}
