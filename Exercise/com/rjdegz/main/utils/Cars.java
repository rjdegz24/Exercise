package com.rjdegz.main.utils;

public interface Cars {
	public void model();
	public void transmission();
	public void horn();
	public default void gear() {
		System.out.println("5");
	}
}
