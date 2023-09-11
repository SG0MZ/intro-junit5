package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	private Greeting greeting;
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before - I am only calles once!!!");
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("In Before Each...");
		greeting = new Greeting();
	}
	
	@Test
	void helloWorld() {	
		System.out.println(greeting.helloWorld());
	}
	
	@Test
	void helloWorld1() {
		System.out.println(greeting.helloWorld("John"));
	}
	
	@Test
	void helloWorld2() {
		System.out.println(greeting.helloWorld("Sam"));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("In After Each...");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After!!! ***** - I am only called once!!!");
	}
}
