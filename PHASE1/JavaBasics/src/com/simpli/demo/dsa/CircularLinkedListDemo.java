package com.simpli.demo.dsa;

public class CircularLinkedListDemo {

	public static void main(String[] args) {

		CircularLinkedList cll = new CircularLinkedList();

		cll.printCLL();

		cll.sortedInsert(4);
		cll.printCLL();

		cll.sortedInsert(14);
		cll.printCLL();

		cll.sortedInsert(7);
		cll.printCLL();

		cll.sortedInsert(5);
		cll.printCLL();

		cll.sortedInsert(9);
		cll.printCLL();

	}

}

class CircularLinkedList {

	Node head = null;

	class Node {
		int data;
		Node next = null;

		public Node(int data) {
			this.data = data;
		}
	}

	void sortedInsert(int data) {
		
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			newNode.next=head;
			return;
		}
		
		// CCL has some elements
		// if newNode is less that the head
		Node current_Node =  head;
		
		if (newNode.data < current_Node.data) {
			newNode.next = current_Node;
			
			// This loops will take the current_Node to the tail
			while(current_Node.next != head)
				current_Node = current_Node.next;
			
			current_Node.next= newNode;
			head = newNode;
		}
		else if (newNode.data >= current_Node.data) { // if newNode is greater that the head
			
			while(current_Node.next != head && current_Node.next.data <= newNode.data)
				current_Node = current_Node.next;
			
			newNode.next = current_Node.next; 
			current_Node.next =newNode;
		}

	}
	
	
	void printCLL() {

		Node current_node = this.head;

		if (current_node == null) {
			System.out.println("CLL is empty ");
			return;
		}

		do {
			System.out.print(current_node.data + "->");

			current_node = current_node.next;
		} while (current_node != this.head);

		System.out.println();
	}

}