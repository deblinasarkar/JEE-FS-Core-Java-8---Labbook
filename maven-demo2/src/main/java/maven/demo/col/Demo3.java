package maven.demo.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  
public class Demo3 {
public static void main(String[] args) {
	 Student s1=new Student(101,"deb",23);  
	  Student s2=new Student(102,"pad",21);  
	  Student s3=new Student(103,"pan",25);   
	  ArrayList<Student> al=new ArrayList<Student>();  
	  al.add(s1); 
	  al.add(s2);  
	  al.add(s3);   
	  Iterator itr=al.iterator();   
	  while(itr.hasNext()){  
	    Student st=(Student)itr.next();  
	    System.out.println(st.rollno+" "+st.name+" "+st.age);  
	  }  
	
}
}

