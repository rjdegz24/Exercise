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

	public static int getRecursiveSumOfDigit(String n, int k) {
	    int iSum = 0;
	        for (int i = 0; i < k; i++) {
	            n += n;
	        }
	        for (int i = 0; i < n.length(); i++) {
	            iSum += n.charAt(i) - '0';
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