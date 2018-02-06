package com.example.test.sorting;

import java.util.ArrayList;
import java.util.List;

public class javaikm {

	public List<String> que;
	public void setup() {
		try {
			esatqs();
		}
		finally {
			//cleanqs();
			System.out.println("qs cleaned up");
		}
	}
	private void cleanqs() {
		// TODO Auto-generated method stub
		if(que.size()>0) {
			System.out.println("que size >0");
		}
		
	}
	private void esatqs() {
		// TODO Auto-generated method stub
		if(false) {
			throw new IllegalArgumentException();
		}
		que = new ArrayList<String>();
		
	}
	
	
	

}
