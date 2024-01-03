package com.simpli.demo.dsa;

public class DLLDemo {

	public static void main(String[] args) {

		DoublyLinkedList DLL = new DoublyLinkedList();

		DLL.printDLL();

		DLL.insertFirst(10);
		DLL.insertFirst(4);
		DLL.insertFirst(7);
		DLL.insertFirst(12);

		DLL.printDLL();
		
		System.out.println("\n Inserting 50 and then 1 using insertLast \n");
		
		DLL.insertLast(50);
		DLL.insertLast(1);
		DLL.printDLL();
	}

}

class DoublyLinkedList {

	Node head = null;

	class Node {

		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

	}

	void insertFirst(int data) {
		Node newNode = new Node(data);

		// If DLL is empty
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void insertLast(int data) {
		Node newNode = new Node(data);

		// If DLL is empty
		if (head == null) {
			head = newNode;
		} else { // If DLL is NOT empty

			Node currentNode = head;

			while (currentNode.next != null)
				currentNode = currentNode.next;

			currentNode.next = newNode; // Tail's next is now the newNode
			newNode.prev = currentNode; // newNode's prev is the old tail.
		}

	}

	public void printDLL() {
		Node current_node = this.head;

		while (current_node != null) {
			System.out.print(current_node.data + "->");
			current_node = current_node.next;
		}
		System.out.println();

	}

}