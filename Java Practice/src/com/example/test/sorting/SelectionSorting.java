package com.example.test.sorting;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SelectionSorting {
    public static int [] arr = { 20, 10, -7, -3, 60, 2 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] sortedBySelectionArr = doSelectionSort(arr);
		
		int[] sortedByQuickArr = doQuickSort(arr, 0, arr.length-1);
		for (int i : sortedBySelectionArr) {
			System.out.print(" " + i);
		}
		
		for (int i : sortedByQuickArr) {
			System.out.print(" " + i);
		}
	}

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				{
					if (arr[j] < arr[index])
						index = j;
				}
			}

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
	
	public static int doPartition(int [] arr, int start, int end){
		
		int pivot = arr[end];
		int pIndex = start;
		for(int i = start; i <= end; i++ ){
			if(arr[i]<= pivot){
				swapArr(i,pIndex);
				pIndex++;	
			}			
		}
		swapArr(pIndex, end);
		return pIndex;
	}
	public static int [] doQuickSort(int [] arr, int start, int end){
		if(start > end){
			int pIndex = doPartition(arr, start, end);
			doQuickSort(arr, start, pIndex);
			doPartition(arr,pIndex+1, end);
		}
		 return arr;
	}

	private static void swapArr(int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
		
	}
}
