package maven.demo.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Mobile{
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
    ArrayList<String> c=new ArrayList<String>();
    public String addMobile(String company, String model)
    {
        	if(!mobiles.containsKey(company))
    		{
        		c.add("model");
        		//System.out.println(c);
        		mobiles.put("company",c);
        		ArrayList<String> v=mobiles.get(model);
        		System.out.println(mobiles.entrySet());
        		return "model successfully added";	
        		
    		}
        	
        	
        	
        	
        	return "";
    	
    }
	public ArrayList<String> getModels(String company) {
		
		
		ArrayList<String> c=new ArrayList<String>();
    	
    	if(!mobiles.containsKey(company))
		{
    		
    		return null;
			
		}
    	mobiles.put("company",c);
    	
	return c;
		
		
	}
	public String buyMobile(String company, String model) {
		
		if(mobiles.containsKey(company))
		{
    		return "mobile sold successfully";	
		}
		else
		{
			return "item not available";
		}
		
	}
    
}
public class set2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Mobile obj=new Mobile();
	HashMap<String, ArrayList<String>> m = new HashMap<>();
	System.out.println(obj.addMobile("Oppo","K3"));
	//System.out.println(m.values());
	//m=obj.getModels("Oppo");
	System.out.println(m);
	System.out.println(obj.buyMobile("Oppo","K3"));
	
}
}
