package lab6;

//import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(1,"deb");
	h.put(2,"pad");
	h.put(3,"pan");
	h.put(4,"san");
	h.put(5,"abhi");
	h.put(6,"roh");
	System.out.println(getValues(h));
	
}

public static List<String> getValues(HashMap<Integer, String> h) {
	List<String> keyValues=h.values().stream().sorted().collect(Collectors.toList());
	
	//List<String> keyValues=h.values().stream().collect(Collectors.toList());
	//Collections.sort(keyValues);
	return keyValues;
		
}


}
