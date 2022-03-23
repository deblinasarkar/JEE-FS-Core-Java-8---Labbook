package lab1;


import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ex4.prime(n);
		sc.close();
	}
	public static void prime(int n)
	{
	    for (int i=2;i<=n;i++) {
	        int c=0;
	        for (int j=2; j<=i/2;j++) {
	            if(i%j==0) {
	                c=1;
	                break;
	            }
	        }
	        if(c==0)
	            System.out.print(i + " ");
	    }
	}
}
