package com.java8.practice.ExcerciseLymda;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 4;
		/*doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println(i+b);
				
			}
		});*/
		doProcess(a, i -> System.out.println(i+b*c));

	}
	public static void doProcess(int i, Process p) {
		p.process(i);
		
	}

}

interface Process{
	

	void process(int i);
}


