package lab2;
import java.util.*;

public class ex3 {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int[] k=getsorted(a);
	for(int l=0;l<k.length;l++)
	{
		System.out.println(k[l]);
		
	}
	sc.close();
	
}
public static int[] getsorted(int[] a)
{
	int i,j;
	for(i=0,j=a.length-1;i<j;i++,j--)
	{
		a[i]=a[i]^a[j];
		a[j]=a[i]^a[j];
		a[i]=a[i]^a[j];
	}
	for(i=0;i<a.length-1;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}

		}
	}
	return a;
	
}
}
