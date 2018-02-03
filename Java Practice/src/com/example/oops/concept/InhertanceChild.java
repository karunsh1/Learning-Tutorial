package com.example.oops.concept;

public class InhertanceChild extends InheritanceParentA  {

	int i = 20;

	InhertanceChild() {
		super(10);
		System.out.println("Class B Constructor");
	}

	public static void main(String[] args) {
		
		InheritanceParentA A = new InheritanceParentA(10);
		
		//System.out.println("Value of i: "+ A.i);
	}

}
