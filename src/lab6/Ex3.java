package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(getSquares(a));
		sc.close();

	}

	public static HashMap<Integer, Integer> getSquares(int[] a) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : a) {
			list.add(i);
		}

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int f = it.next();
			int sq = f * f;
			h.put(f, sq);

		}
		return h;
	}
}
