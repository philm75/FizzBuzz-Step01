package com.equalexperts.fb;

import java.util.stream.IntStream;

/**
 * Description - "FizzBuzz" - Step 1
 *
 */
public class FizzBuzz {

	/**
	 * Minimum range value.
	 */
	private final int minRange;
	
	/**
	 * Maximum range value.
	 */
	private final int maxRange;
	
	/**
	 * Exception messages.
	 */
	private static final String MIN_RANGE_ERROR = "Minimum Range must be 0 or greater - %s";
	private static final String MAX_RANGE_ERROR = "Maximum Range must be greater than the Minimum Range - %s";
	
	/**
	 * Output messages.
	 */
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	
	/**
	 * @param minRange
	 * @param maxRange
	 */
	public FizzBuzz(int minRange, int maxRange) {
        if (minRange < 0) {
            throw new IllegalArgumentException(String.format(MIN_RANGE_ERROR, String.valueOf(minRange)));
        }
        if (minRange > maxRange) {
            throw new IllegalArgumentException(String.format(MAX_RANGE_ERROR, String.valueOf(maxRange)));
        }
		this.minRange = minRange;
		this.maxRange = maxRange;
	}
	
	public void run() {		
		IntStream.rangeClosed(minRange, maxRange).forEach(number -> {
			print(number);
		});
	}
	
	
	/**
	 * 
	 * ``if (number contains a 3) print "lucky"

else if (number is multiple of 15) print "fizzbuzz"

else if (number is multiple of 5) print "fizz"

else if (number is multiple of 3) print "buzz"

else print number```
	 * 
	 * 
	 * 
	 */
	
	
	/**
	 * Format the output according to the rules in step 1.
	 * 
	 * @param value
	 * @return
	 */
	private void print(Integer value) {	
		boolean isDivisableByThree = (value % 3 == 0);
		boolean isDivisableByFive = (value % 5 == 0);
		boolean isDivisableByFifteen = (value % 15 == 0);
				
		if (isDivisableByFifteen) {
			System.out.print(FIZZ);
			System.out.print(BUZZ);
		} else if (isDivisableByFive) {
			System.out.print(BUZZ);			
		} else if (isDivisableByThree) {
			System.out.print(FIZZ);			
		} else {
			System.out.print(value);			
		}
			
		if (value.intValue() < maxRange) {
			System.out.print(" ");			
		}
	}

	/**
	 * Program entry point.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz(1, 20);
		fizzBuzz.run();
		System.out.println("");
		fizzBuzz.run();
	}
}