package com.example.number;

import java.math.BigDecimal;
import com.example.number.ConvertNumber;

public class DataTypeNumber {

	public static void main(String[] args) {
		System.out.println("**************************** Basic Primitives Representation **********************************");
		numberPrimitive();	
		
		System.out.println("**************************** Use og BigDecimal Class to get exact fraction value  **********************************");

		bigDecimalValueUsed();		
		
		System.out.println("**************************** How To TypeCasting of Primitive Numbers  **********************************");

		/*ConvertNumber convNum = new ConvertNumber();*/
		ConvertNumber.convertNumber();
		
		System.out.println("**************************** Math Operation  **********************************");

		//MathOperation mathOpt = new MathOperation();
		MathOperation.mathOperation();
		
		

	}

	private static void numberPrimitive() {
		byte b = 1;
		short sh = 1;
		int i = 1;
		long l = 1L;
		float f = 1f;
		double d = 1d;	
		
		System.out.println("Byte: " +b);
		System.out.println("Short: " +sh);
		System.out.println("Integer: " +i);
		System.out.println("Byte: " +l);
		System.out.println("Byte: "  +f);
		System.out.println("Byte: " +d);	
		if(b < Byte.MAX_VALUE){
			b++;
		}
		System.out.println("ByteIncreased Value: " +b);
	}

	private static void bigDecimalValueUsed() {
		double value = 0.012;
		double pSum = value + value + value;
		System.out.println("Sum of Primitive Data Type: " +pSum); // Psum has imprecise sum of double 
		/**
		 * To get the exact decimal we have BigDecimal Class by which 
		 * we can do operation and get exact value what we want
		 */
		String strValue = Double.toString(value);
		System.out.println("Converted Value: " +strValue);
		BigDecimal bigValue = new BigDecimal(strValue);
		
		BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
		System.out.println("Sum of BigDecimal" +bSum);
	}

}
