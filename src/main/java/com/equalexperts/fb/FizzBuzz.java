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
	 * Format the output according to the rules in step 1.
	 * 
	 * @param value
	 * @return
	 */
	private void print(Integer value) {		
		boolean isDivisable = false;
		
		if (value % 3 == 0) {
			System.out.print(FIZZ);
			isDivisable = true;
		} 
		
		if (value % 5 == 0) {
			System.out.print(BUZZ);
			isDivisable = true;
		} 
		
		if (!isDivisable) {
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