package com.geeks.arrays;

public class LeadersInArray {

	/*
	 * array =[16, 17, 4 , 3, 5 ,2] leaders are 17, 5 , 2 greater than all the
	 * elements to its right side
	 */
	private void printLeaders(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int j;
			for ( j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j])
					
					break;
			}
			if (j == n) // the loop didn't break that means it is leader
				System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		LeadersInArray l = new LeadersInArray();
		l.printLeaders(arr, n);
	}

}
