package com.simpli.demo.dsa;

public class LLDemo {

	public static void main(String[] args) {
		MyLinkedList SLL1 = new MyLinkedList();

		SLL1.printSLL();

		SLL1.insert(10);
		SLL1.insert(7);
		SLL1.insert(6);
		SLL1.insert(23);
		SLL1.insert(16);
		SLL1.insert(17);

		SLL1.printSLL();

		SLL1.delete(10);
		SLL1.printSLL();

		SLL1.delete(16);
		SLL1.printSLL();

		SLL1.delete(100);
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

	// Insert operation
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

	// Remove operation
	void delete(int key) {

		if (head == null) {
			System.err.println("SLL is empty. So nothing to delete");
			return;
		}

		if (head.data == key) {
			head = head.next;
			System.out.println("SLL's data was the key. Head deleted");
			return;
		}
		
		// If we are here, then the key may in some position
		// after the head.

		Node dummyNode = head;

		// Loop thru and either stop one position before the key or
		// before the tail if key was not found.
		while (dummyNode.next != null && dummyNode.next.data != key) {
			dummyNode = dummyNode.next;
		}

		if (dummyNode.next == null) {
			System.out.println("Key not found ");
			return;
		} else if (dummyNode.next.data == key) {
			dummyNode.next = dummyNode.next.next;
			System.out.println("Found the key at non-head postion and deleted ");
			return;
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
