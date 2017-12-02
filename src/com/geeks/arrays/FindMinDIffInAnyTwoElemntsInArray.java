package com.geeks.arrays;

import java.util.Arrays;

public class FindMinDIffInAnyTwoElemntsInArray {

	public static void findMin(int arr[]){
		int diff = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		for(int i =0; i < arr.length-1;i++){
			if(arr[i+1] - arr[i] < diff ){
				diff = arr[i+1] - arr[i];
			}
		}
		System.out.println("Min Diff is "+ diff);
	}
	public static void main(String[] args) {
		int arr[] = {1, 5, 3, 19, 18, 25}; //Output : 1 Minimum difference is between 18 and 19
		int arr1[] =  new int[] {1, 19, -4, 31, 38, 25, 100};// Output : 5 Minimum difference is between 1 and -4
		findMin(arr);
		findMin(arr1);
	}
}
