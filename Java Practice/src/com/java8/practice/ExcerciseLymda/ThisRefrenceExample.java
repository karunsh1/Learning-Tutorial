package com.java8.practice.ExcerciseLymda;

public class ThisRefrenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
		
	}
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is "+ i);
			System.out.println(this); 
		});	
	}
	public static void main(String[] args) {
		ThisRefrenceExample thisRefClass = new ThisRefrenceExample();
		/*thisRefClass.doProcess(10, new Process() {
			
			@Override
			public void process(int i) {
				System.out.println("Value of i is "+ i);
				System.out.println(this);
				
			}
			public String toString() {
				return "This is the anonymous inner class";
			}
		});*/
		thisRefClass.execute();
		
	}
	public String toString() {
		return "This is the anonymous inner class";
	}

}
