package com.multithreading.Practice;

public class MultipleLockWithSynchronization {

	public static void main(String[] args) throws InterruptedException {
		new Worker().main();
	}

}
