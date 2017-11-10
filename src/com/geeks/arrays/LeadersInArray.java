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
	private void printLeadersEfficient(int arr[], int size)
    {
        int max_from_right =  arr[size-1];
  
        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");
      
        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {           
            max_from_right = arr[i];
            System.out.print(max_from_right + " ");
            }
        }    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		LeadersInArray l = new LeadersInArray();
		l.printLeaders(arr, n);
		l.printLeadersEfficient(arr, n);
	}

}
