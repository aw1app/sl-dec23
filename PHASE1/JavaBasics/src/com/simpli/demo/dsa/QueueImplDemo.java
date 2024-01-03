package com.simpli.demo.dsa;

public class QueueImplDemo {

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(5);

		myQueue.display();

		myQueue.enqueue(7);
		myQueue.enqueue(17);
		myQueue.enqueue(23);

		myQueue.display();

		myQueue.enqueue(9);
		myQueue.display();

		myQueue.enqueue(21);
		myQueue.display();

		myQueue.enqueue(45);
		myQueue.display();
		
		System.out.println("\n Dequeue'ing. Got the dequeue'ed value as "+myQueue.dequeue());
		myQueue.display();
		
		System.out.println("\n Dequeue'ing. Got the dequeue'ed value as "+myQueue.dequeue());
		myQueue.display();

	}

}

class MyQueue {

	int REAR = -1;
	int FRONT = -1;

	final int capacity;

	int[] items;

	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.items = new int[this.capacity];
	}

	void enqueue(int val) {
		if (isFull())
			System.out.println("\nQueue is full. Cannot add " + val);

		else {
			if (FRONT == -1)
				FRONT = 0;

			REAR = REAR + 1;
			items[REAR] = val;
		}
	}

	int dequeue() {
		int dequeuedVal = -1;

		if (isEmpty())
			System.out.println("\nQueue is empty. Nothing to dequeue.");
		else {
			dequeuedVal = items[FRONT];
			FRONT++;

			// After deque of current of element check if the queue is empty
			if (FRONT > REAR) {
				REAR = -1;
				FRONT = -1;
			}

		}

		return dequeuedVal;
	}

	// Helper functions
	boolean isFull() {
		if (REAR - FRONT == capacity - 1) {
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		if (FRONT == -1)
			return true;
		else
			return false;
	}

	void display() {

		if (isEmpty())
			System.out.println("\n Queue is empty");
		else {
			System.out.println("\nItems -> ");
			for (int i = FRONT; i <= REAR; i++)
				System.out.println(items[i] + " ");
		}

	}

}
