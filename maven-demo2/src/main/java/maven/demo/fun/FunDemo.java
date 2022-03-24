package maven.demo.fun;

import java.util.function.Function;

//@FunctionalInterface

//interface Int1 {
//
//	void m1();
//
//	default void m2() {
//	}
//
//	static void m3() {
//
//	}
//}

// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html 

public class FunDemo {

	public static void main(String[] args) {

//		List<Integer> intList = new ArrayList<>();
//		intList.add(25);
//		intList.add(22);
//		intList.add(9);
//		intList.add(31);
//		intList.add(77);
//		intList.add(81);
//		System.out.println(intList);
//		intList.forEach((a) -> {
//			System.out.println(a.toString());
//		});

//		Function<Integer, Integer> function = num1 -> num1 * num1;

		Function<Integer, Integer> function = (num1) -> {
			return num1 * num1;
		};

		System.out.println(function.apply(10));

	}

}