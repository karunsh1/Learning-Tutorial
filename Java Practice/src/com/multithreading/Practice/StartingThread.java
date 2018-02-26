package com.multithreading.Practice;

class Runner implements Runnable {

	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Hello"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class StartingThread {

	public static void main(String[] args) {

		/*Runner runner1 = new Runner();
		runner1.start();
		//runner1.run();
		Runner runner2 = new Runner();
		runner2.start();*/
		
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		t1.start();
		t2.start();
		
		Thread t3 = new Thread (new Runnable() {
			public void run() {
				for(int i=0; i<10;i++) {
					System.out.println("Hello anonymous "+ i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t3.start();

	}

}
/*class Runner extends Thread{
	
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Hello"+ i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}*/
