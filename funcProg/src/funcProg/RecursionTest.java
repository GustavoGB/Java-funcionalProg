package funcProg;
import java.util.stream.IntStream;

public class RecursionTest {
	public static void main(String[] args) {
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
	}
	
		
	private static boolean isPrime(final int number) {
		//Imperative 
//        for (int = 2; int <number;i++)
//			if(number %i == 0)
//             return false;
		//Declarative
		return number > 1 &&
				IntStream.range(2, number)
						.noneMatch(index -> number % index == 0);
	}
}
