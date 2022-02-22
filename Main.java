package buzzFizz_Problem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		Print integers 1 to N,
//		but print “Fizz” if an integer is divisible by 3,
//		“Buzz” if an integer is divisible by 5, 
//		and
//		“FizzBuzz” if an integer is divisible by both 3 and 5.
		
		Scanner sc = new Scanner(System.in);
		int setDim;
		System.out.print("ENTER THE DIMENSION OF THE ARRAY -> ");
		setDim = sc.nextInt();
		int[] numbers = new int[setDim];
		int counter = 0;
		
		System.out.println("");
		for (int i = 0; i < numbers.length; i++) {
			counter++;
			if(counter % 3 == 0 && counter % 5 == 0)
				System.out.println("FizzBuzz");
			else if (counter % 3 == 0)
				System.out.println("Fizz");
			else if (counter % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(counter);
		}
		sc.close();
		
	}
	
}
