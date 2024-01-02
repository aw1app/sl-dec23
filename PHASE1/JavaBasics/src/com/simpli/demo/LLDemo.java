package com.simpli.demo;

public class LLDemo {

	public static void main(String[] args) {
		MyLinkedList SLL1 = new MyLinkedList();
		
		SLL1.printSLL();
		
		SLL1.insert(10);
		SLL1.insert(7);
		SLL1.insert(6);
		SLL1.insert(23);
		
		SLL1.printSLL();
		
	}

}

class MyLinkedList {

	Node head = null;

	class Node {
		int data;
		Node next = null;

		public Node(int data) {
			this.data = data;
		}
	}

	// Insert
	void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		else { // LL is not empty

			Node dummyNode = head;

			while (dummyNode.next != null)
				dummyNode = dummyNode.next;

			// at this point, dummyNode is the tail
			dummyNode.next = newNode;

		}

	}

	// display
	void printSLL() {

		Node dummyNode = this.head;

		while (dummyNode != null) {
			System.out.print(dummyNode.data + "->");
			dummyNode = dummyNode.next;
		}

		System.out.println();
	}

}
