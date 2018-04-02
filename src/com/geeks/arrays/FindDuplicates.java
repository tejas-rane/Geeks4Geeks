package com.geeks.arrays;

public class FindDuplicates {

	public static void findDuplicates(int[] arr){
		int size = arr.length;
		for(int i =0 ; i< size; i++){
			if(arr[Math.abs(arr[i])]>=0){
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				System.out.println(arr[i]);
			}
			else{
				System.out.println(Math.abs(arr[i])+ " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {
			10, 2, 3, 1 ,3, 6, 6,4
		};
		findDuplicates(arr);
	}

}
