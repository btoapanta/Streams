package streams;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		//printAllNumbersInListFunctional(Arrays.asList(12,9,13,4,6,3,4,12,15));
		//printAllNumbersInListFunctionalEven(Arrays.asList(12,9,13,4,6,3,4,12,15));
		//printAllNumbersInListFunctionalEvenLambda(Arrays.asList(12,9,13,4,6,3,4,12,15));
		//printAllNumbersInListFunctionalOddLambda(Arrays.asList(12,9,13,4,6,3,4,12,15));
		//printAllCoursesIndividually(Arrays.asList("Spring","Spring Boot","Api","Microservices","AWS","PCF","Azure","Docker","Kubernetes"));
		//printAllCoursesContainsSringIndividually(Arrays.asList("Spring","Spring Boot","Api","Microservices","AWS","PCF","Azure","Docker","Kubernetes"));
		//printAllCoursesContainsFourLettersSringIndividually(Arrays.asList("Spring","Spring Boot","Api","Microservices","AWS","PCF","Azure","Docker","Kubernetes"));
		//printAllCubesNumbersInListFunctionalOddLambda(Arrays.asList(12,9,13,4,6,3,4,12,15));
		printCharactersNumberAllCourses(Arrays.asList("Spring","Spring Boot","Api","Microservices","AWS","PCF","Azure","Docker","Kubernetes"));
	
	}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.forEach(System.out::println);//nombre de la clase y metodo , se lo llama para cada numero
		
	}
	
	private static void printAllNumbersInListFunctionalEven(List<Integer> numbers) {
		numbers.stream()
			.filter(Example1::isEven)
			.forEach(System.out::println);//nombre de la clase y metodo , se lo llama para cada numero		
	}
	////////////////////Lambdas
	
	private static void printAllNumbersInListFunctionalEvenLambda(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2==0)
			.forEach(System.out::println);//nombre de la clase y metodo , se lo llama para cada numero		
	}
	
	private static void printAllNumbersInListFunctionalOddLambda(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2!=0)
			.forEach(System.out::println);//nombre de la clase y metodo , se lo llama para cada numero		
	}
	
	private static void printAllCoursesIndividually(List<String> courses) {
		courses.stream()
			.forEach(System.out::println);		
	}
	
	private static void printAllCoursesContainsSringIndividually(List<String> courses) {
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);		
	}
	private static void printAllCoursesContainsFourLettersSringIndividually(List<String> courses) {
		courses.stream()
			.filter(course -> course.length()>=4)
			.forEach(System.out::println);		
	}
	
	
	//////////////MAPAS
	
	private static void printAllCubesNumbersInListFunctionalOddLambda(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2!=0)
			.map(number2 -> number2 * number2)
			.forEach(System.out::println);//nombre de la clase y metodo , se lo llama para cada numero		
	}
	
	private static void printCharactersNumberAllCourses(List<String> courses) {
		courses.stream()
			.map(course -> course+ ": "+ course.length())
			.forEach(System.out::println);		
	}
}
