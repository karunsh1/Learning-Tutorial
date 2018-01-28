package com.example.test.sorting;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 20, 10, -7, -3, 60, 2 };
		int[] sortedArr = doSelectionSort(arr1);
		for (int i : sortedArr) {
			System.out.print(" " + i);
		}
	}

	
	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                {if (arr[j] < arr[index]) 
                    index = j;}}
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
