package com.geeks.arrays;

import java.util.Arrays;

public class FindMaxProduct {

	/*
	 * Input: arr[] = {1, 4, 3, 6, 7, 0}  
	 * Output: {6,7}  
	 *	Input: arr[] = {-1, -3, -4, 2, 0, -5} 
	 *	Output: {-4,-5} 
	 */
	public static void findMaxProductPair(int arr[]){
		Arrays.sort(arr);
		int compute1 = arr[0]*arr[1];
		int compute2 = arr[arr.length-2]*arr[arr.length-1];
		
		if(compute1 < compute2){
			System.out.println("The pair with max product is" + " [ "+arr[arr.length-2] + " , "+arr[arr.length-1] + "]");
		}else{
			System.out.println("The pair with max product is" + " [ "+arr[0] + " , "+arr[1] + "]");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 4, 3, 6, 7, 0};
		int arr2[] = {-1, -3, -4, 2, 0, -5};
	}

}
