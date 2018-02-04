package com.example.oops.concept;

public class InhertanceChild extends InheritanceParentA  {

	
	{
		System.out.println("Static child");
	}
	
	InhertanceChild(int i) {
		super(++i);
		System.out.println("Class B Constructor "+ i);
	}

	public static void main(String[] args) {
		
		InhertanceChild A = new InhertanceChild(10);		
		System.out.println("Value of i: "+ A.i);
	}

}
