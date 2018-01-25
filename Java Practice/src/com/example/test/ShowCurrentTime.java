package com.example.test;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliSeconds = System.currentTimeMillis();
		long currentSeconds = totalMilliSeconds / 1000;
		long currentSecond = currentSeconds % 60;
		long totalMinutes = currentSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		System.out.println("totalMilliSeconds" + totalMilliSeconds + "  currentSeconds" + currentSeconds
				+ "currentSecond    " + " " + currentSecond + "totalMinutes" + totalMinutes + "       currentMinutes"
				+ currentMinutes);
		

	}

}
