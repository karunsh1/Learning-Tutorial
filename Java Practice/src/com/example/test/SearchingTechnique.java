package com.example.test;

public class SearchingTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1, 3, 4, -3, 7, 5};
		System.out.println("the result by linear search: ");
		System.out.println(linearSearch(list, 4));
		System.out.println(linearSearch(list, 3));
		System.out.println(linearSearch(list, -3));
		System.out.println("the result by binary search: ");
		System.out.println(binarySearch(list, 4));
		System.out.println(binarySearch(list, 3));
		System.out.println(binarySearch(list, -3));

	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == key) {
				return i;
			}
		}
		return -1;

	}

	public static int binarySearch(int[] list, int key) {

		int low = 0;
		int high = list.length - 1;
		//System.out.println( "   "+low + "    "+high);
		
		 bubbleSort(list);
		for (int i = 0; i < list.length-1; i++) {
			//System.out.print(list[i]);
		}
		while (high >= low) {
			int mid = (low + high) / 2;
			
			if (list[mid] > key) {
				high = mid - 1;

			} else if (key == list[mid]) {
				//System.out.println("mid: "+ mid);
				return mid;
				
			} else {
				low = mid + 1;
			}
		}

		return - low - 1;

	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		

	}

}
