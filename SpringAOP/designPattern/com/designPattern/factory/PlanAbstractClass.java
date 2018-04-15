package com.designPattern.factory;

abstract class PlanAbstractClass {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println("The toltal amount is " + units * rate);
	}

}
