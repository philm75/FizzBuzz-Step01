package com.mcs;

import java.util.Iterator;
import java.util.stream.IntStream;

/**
 * @author Phil Merrilees
 * Sep 5, 2017
 * Description - "FizzBuzz" program
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
	
	public void go() {
		Iterator<Integer> it = IntStream.rangeClosed(minRange, maxRange).iterator();
		while (it.hasNext()) {
			System.out.print(output(it.next()));
		}
	}
	
	private static String output(Integer value) {
		StringBuilder output = new StringBuilder();
		boolean isDivisable = false;
		if (value % 3 == 0) {
			output.append(FIZZ);
			isDivisable = true;
		} 
		if (value % 5 == 0) {
			output.append(BUZZ);
			isDivisable = true;
		}
		
		if (!isDivisable) {
			output.append(String.valueOf(value));			
		}
		output.append(" ");
		return output.toString();
	}


	/**
	 * Program entry point.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz(1, 20);
		fizzBuzz.go();
	}
}
