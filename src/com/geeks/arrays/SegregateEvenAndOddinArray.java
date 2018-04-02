package com.geeks.arrays;

public class SegregateEvenAndOddinArray {

	private static void segregateEvenOdd(int[] arr) {
		int l = 0;
		int r = arr.length-1;
		while(l<r){
			while(arr[l] %2==0 && l<r){
				l++;
			}
			while(arr[r] %2==1 && l<r){
				r--;
			}
			if(l<r){
				//swap
				int temp = arr[l];
				arr[l]= arr[r];
				arr[r]= temp;
				l++;
				r--;
			}
		}
	}
    public static void main (String[] args)
    {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};
 
        segregateEvenOdd(arr);
 
        System.out.print("Array after segregation \n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
