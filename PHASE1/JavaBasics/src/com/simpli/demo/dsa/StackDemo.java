package com.simpli.demo.dsa;

public class StackDemo {

	public static void main(String[] args) {
		MyStack myStack1 = new MyStack(5);
		
		myStack1.displayStack();
		
		myStack1.push(6);
		myStack1.push(3);
		
		myStack1.displayStack();
		myStack1.push(7);
		myStack1.push(11);
		
		myStack1.displayStack();
		myStack1.push(18);
		myStack1.push(30);
		
		myStack1.displayStack();
		
		System.out.println("\n Pop'ing. Got the pop'ed value as "+myStack1.pop());
		myStack1.displayStack();
		
		System.out.println("\n Pop'ing. Got the pop'ed value as "+myStack1.pop());
		myStack1.displayStack();
		
	}

}

class MyStack {

	int TOP = -1;
	final int capacity;

	int[] items;

	public MyStack(int capacity) {
		this.capacity = capacity;
		this.items = new int[this.capacity];
	}

	void push(int val) {

		if (TOP == capacity - 1) {
			System.out.println("\n Stack is full. cannot add.." + val);
		} else {
			TOP=TOP+1;
			items[TOP] = val;
		}
	}
	
	int pop() {
		int poppedVal = -1;
		
		if (TOP == -1)
			System.out.println("\n Stack is empty. cannot pop..");
		else {
			poppedVal = items[TOP];
			TOP=TOP-1;
		}
		
		return poppedVal;		
	}
	
	
	void displayStack() {
		System.out.println("\n STACK CONTENTS");

		for (int i = TOP; i >= 0; i--)
			System.out.println(items[i]);
	}

}