package lab2;
import java.util.*;

public class ex4 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ex4.modifyArray(a);
	}
	public static void modifyArray(int[] a)
	{
		    
		    int[] b=new int[a.length];
		    int c=0;
        	Arrays.sort(a);
        	for (int i=0;i<a.length-1;i++) {
            	if (a[i] != a[i + 1]) {
                	b[c] = a[i];
                	c++;
            }
        }
         b[c] = a[a.length - 1];
        for (int i = 0; i <= c; i++) {
            System.out.println(b[i]);
        }  
}
}

 
