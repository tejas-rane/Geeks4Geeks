package com.geeks.linkedlist;

import com.geeks.linkedlist.LinkedList.Node;

public class ClubEvenAndOddPositions {
	private static void clubEvenAndOddPositions(Node head) {
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}else if(head.next == null){
			System.out.println("LinkedList has just one element");
			return;
		}else if(head.next.next == null){
			System.out.println("LinkedList has just two element, they are already at correct position");
			return;
		}
		// more than 2 elements.
		Node evenHead = head;
		Node evenHeadRunner = head;
		Node oddHead = evenHead.next;
		Node oddHeadRunner = evenHead.next;
		boolean endingOnEven = false;
		boolean endingOnOdd = false;
		while(evenHeadRunner!=null && oddHeadRunner !=null && oddHeadRunner.next != null && evenHeadRunner.next != null) {
			if(evenHeadRunner.next != null && evenHeadRunner.next.next!=null){
			evenHeadRunner.next = evenHeadRunner.next.next;
			evenHeadRunner = evenHeadRunner.next;
			}
			else{
				endingOnEven = true;
			}
			if(oddHeadRunner.next != null && oddHeadRunner.next.next!=null){
			oddHeadRunner.next = oddHeadRunner.next.next;
			oddHeadRunner = oddHeadRunner.next;
			}
			else{
				endingOnOdd = true;
			}
			/*if(count %2 == 0){
				evenHeadRunner.
			}*/
		}
		evenHeadRunner.next = oddHead;
		if(endingOnEven)evenHeadRunner.next = null;// terminating the linked list
		if(endingOnOdd)oddHeadRunner.next = null;// terminating the linked list
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
