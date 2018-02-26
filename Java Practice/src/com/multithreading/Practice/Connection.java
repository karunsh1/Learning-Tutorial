package com.multithreading.Practice;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();
	Semaphore sem = new Semaphore(10,true);

	private int connection = 0;

	private Connection() {

	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() throws InterruptedException {
		sem.acquire();
		try {
			doConnect();
		} finally {
			sem.release();
		}

	}

	public void doConnect() throws InterruptedException {

		synchronized (this) {
			connection++;
			System.out.println("Current connection: " + connection);

		}
		Thread.sleep(2000);
		synchronized (this) {
			connection--;
			System.out.println("decrenemt connection: " + connection);

		}

	}

}
