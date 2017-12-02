package com.geeks.arrays;

public class SegregateZeroAndOneInBinaryArray {

	public static void segregate(int[] input){
		int index1= 0 ;
		int index2= input.length-1;
		
		while(index1 <= index2){
			while(input[index1] == 0){
				index1++;
			}
				
			while(input[index2]==1){
				index2--;
			}
			int temp = input[index1];
			input[index1] = input[index2];
			input[index2]= temp;
			index1++;
			index2--;
		}
		
		for (int i : input) {
			System.out.print(i+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] =  new int[] {0,1,0,1,1,1,0,0,0,1,0,1};
		segregate(arr1);
	}

}
