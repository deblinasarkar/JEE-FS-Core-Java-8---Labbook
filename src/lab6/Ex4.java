package lab6;
import java.util.HashMap;
public class Ex4 {
	public static void main(String[] args) {

		HashMap<Integer, Integer> m = new HashMap<>();
		m.put(101,60);
		m.put(102,80);
		m.put(103,50);
		m.put(104,90);
		m.put(105,70);
		m.put(106,98);
		System.out.println(getStudents(m));
	}

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> m) {
		String b="Bronze";
		String c="Silver";
		String d="Gold";
		HashMap<Integer, String> result = new HashMap<>();
		for (HashMap.Entry<Integer, Integer> entry : m.entrySet()) {
			if (entry.getValue() >=70 && entry.getValue() <80) {
				Integer a = entry.getKey();
				result.put(a,b);
			}
			else if (entry.getValue() >=80 && entry.getValue() <90) {
				Integer a = entry.getKey();
				result.put(a,c);
			}
			else if(entry.getValue()>=90)
			{
				Integer a = entry.getKey();
				result.put(a,d);
			}	
	}
		return result;
}
}