package com.geeks.linkedlist;

import com.geeks.linkedlist.LinkedList.Node;

public class ClubEvenAndOddPositions {
	private static void clubEvenAndOddPositions(Node head) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(0);
		list.append(1);list.append(2);list.append(3);list.append(4);list.append(5);list.append(6);
		list.append(7);list.append(8);
		list.printlist();
		//0  1  2  3  4  5  6  7  8 
		//0  1  2  3  4  5  6  7  8  
		clubEvenAndOddPositions(list.head);
		//expected output is 0  1  2  3  6  7  8
		list.printlist();
	}
}
