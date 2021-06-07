package com.rjdegz.main;

import com.rjdegz.main.utils.Cars;

public class MyMain {

	public static void main(String[] args) {
		Mazda mazda = new Mazda();
		mazda.model();
		mazda.transmission();
		mazda.horn();
		mazda.gear();
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