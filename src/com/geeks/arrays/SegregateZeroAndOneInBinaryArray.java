package com.geeks.arrays;

public class SegregateZeroAndOneInBinaryArray {

	public static void segregate(int[] input){
		int index1= 0 ;
		int index2= input.length-1;
		
		while(index1 < index2){
			if(input[index1] == 0){
				index1++;
			}else {
				
			}
				
			if(input[index2]==1){
				index2--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] =  new int[] {0,1,0,1,1,1,0,0,0,1,0};
		segregate(arr1);
	}

}
