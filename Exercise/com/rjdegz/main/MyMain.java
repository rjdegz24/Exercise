package com.rjdegz.main;

import com.rjdegz.main.utils.Cars;

public class MyMain {

	public static void main(String[] args) {
		Mazda mazda = new Mazda();
		mazda.model();
		mazda.transmission();
		mazda.horn();
		mazda.gear();
		
		System.out.println(getRecursiveSumOfDigit("2147283647", 2147283647));
	}

	public static long getRecursiveSumOfDigit(String n, long k) {
	    long iSum = 0;
	    StringBuilder sb = new StringBuilder(n);
	        for (int i = 0; i < k; i++) {
	            sb.append(n);
	        }
	        for (int i = 0; i < n.length(); i++) {
	            iSum += sb.toString().charAt(i) - '0';
	        }
	            return (iSum >= 10) ? getRecursiveSumOfDigit(String.valueOf(iSum), 1) : iSum;
	}
}





class Mazda implements Cars {

	@Override
	public void model() {
		System.out.println("Mazda 3");
	}

	@Override
	public void transmission() {
		System.out.println("Automatic");
	}

	@Override
	public void horn() {
		System.out.println("Beep Beep!");
	}
	
}