package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex6 {
	public static void main(String[] args) {

		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 23);
		m.put(2, 13);
		m.put(3, 53);
		m.put(4, 5);
		m.put(5, 33);
		m.put(6, 43);
		System.out.println(votersList(m));
	}

	public static List<Integer> votersList(Map<Integer, Integer> m) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if (entry.getValue() > 18) {
				Integer a = entry.getKey();
				list.add(a);
			}

		}
		return list;
	}
}
