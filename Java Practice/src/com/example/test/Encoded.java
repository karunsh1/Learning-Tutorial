package com.example.test;

import java.util.Base64;

public class Encoded {
	
	
	

	public static void main(String[] args) {
		
		String a = "test";
		byte[] encodedBytes = Base64.getEncoder().encode(a.getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
		System.out.println("decodedBytes " + new String(decodedBytes));

	}

}
