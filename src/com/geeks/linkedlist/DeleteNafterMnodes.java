package com.geeks.linkedlist;

import com.geeks.linkedlist.LinkedList.Node;

public class DeleteNafterMnodes {
	public static void deleteNNodesAfterMnodes(int n, int m , Node head){
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		
		Node cutStart = head;
		Node cutEnd = head;
		int countUntil = m;
		int deleteUntil = n;
		
		for(int i = 1;i< countUntil;i++ ){
			if(cutStart != null && cutStart.next != null){
			cutStart = cutStart.next;cutEnd = cutEnd.next;
			}else{
				System.out.println("values too high, list length is less than the range");
				return;
			}
		}
		
		for(int i = 0;i<= deleteUntil;i++ ){
			if(cutEnd != null && cutEnd.next != null){
			cutEnd = cutEnd.next;
			}else{
				System.out.println("values too high, list length is less than the range");
				return;
			}
		}
		cutStart.next = cutEnd;
		
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(0);
		list.append(1);list.append(2);list.append(3);list.append(4);list.append(5);list.append(6);
		list.append(7);list.append(8);
		list.printlist();
		//0  1  2  3  4  5  6  7  8  
		deleteNNodesAfterMnodes(2,4,list.head);
		//expected output is 0  1  2  3  6  7  8
		list.printlist();
	}

}
