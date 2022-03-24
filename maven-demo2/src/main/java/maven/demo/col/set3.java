package maven.demo.col;

import java.util.Scanner;

class Activity{
	  //Implement Activity class here..
	String string1;
	String string2;
	String operator;
	Activity(String string1,String string2,String operator)
	{
		this.string1=string1;
		this.string2=string2;
		this.operator=operator;
	}
}



	public class set3 {
	  public static String handleException(Activity a) throws Exception
	  {
		  if(a.string1.equals("") || a.string2.equals("") )
		  {
			  throw new NullPointerException("Null values found");
		  }
		  else if(a.operator.equals("+") && a.operator.equals("-"))
		  {
			  throw new Exception(a.operator);
		  }
		  else
		  {
			  return "No Exception Found";
		  }
		  
	  }
	  public static String doOperation(Activity a)
	  {
		  Scanner sc=new Scanner(System.in);
		  String res="";
		  int ch=sc.nextInt();
		  switch(ch)
		  {
		  case 1:res= a.string1 + a.string2;
		  System.out.println(res);
		  break;
		  case 2:res= a.string1.replace(a.string2,"");
		  System.out.println(res);
		  break;
			
		  }
		  return res; 
		  
	  }
	  
		public static void main(String args[] ) throws Exception {
	    //Write your own main to check the program...
			Scanner sc=new Scanner(System.in);
			String string1=sc.next();
			String string2=sc.next();
			String operator=sc.next();
			Activity obj=new Activity(string1,string2,operator);
			System.out.println(set3.handleException(obj));
			System.out.println(set3.doOperation(obj));
		}
	}
