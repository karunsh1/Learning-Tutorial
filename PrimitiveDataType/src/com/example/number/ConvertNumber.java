package com.example.number;

public class ConvertNumber {
	
	public static void convertNumber(){
		
		int intValue1 = 400;
		int intValue2 = intValue1;
		System.out.println("The 2nd Value is " +intValue2);
		long longValue = intValue1;
		System.out.println("The long value is " +longValue);
		
		short shortValue = (short)intValue1;
		System.out.println("The Short Value afteer casting is " +shortValue);
		
		byte byteValue = (byte) intValue1;
		System.out.println("The byte value after casting integer value is  " +byteValue);
		
		double doubleValue = 2.0045d;
		intValue2 = (int) doubleValue;		
		System.out.println("The double value and cast to integer value are " + doubleValue + " and  "  + intValue2);
		
		
	}

}
