package streams;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,9,13,4,6,2,4,12,15);
		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int addListFunctional(List<Integer> numbers) {
		return numbers.stream().reduce(0, Example2::sum);
	}
	
}
