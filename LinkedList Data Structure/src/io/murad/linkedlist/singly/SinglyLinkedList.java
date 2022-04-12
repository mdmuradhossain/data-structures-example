package io.murad.linkedlist.singly;

public class SinglyLinkedList {

	public Node head = null;

	// class Node that hold data and a reference/link
	// to the next Node in the list
	class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/*
	 * Method to add a node at the beginning of the list
	 */
	public void addNodeAtTheBeginning(int data) {
		System.out.println("Add a node with data " + data + " in the beginning.");
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			// Point the new node's next to head
			newNode.next = this.head;

			// Make the new node as head
			this.head = newNode;
		}
	}

	/*
	 * Method to add a node at the end of the list
	 */
	public void addNodeAtTheEnd(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Check if the list is empty
		if (this.head == null) {
			// Make the new node as head
			this.head = newNode;
		} else {
			Node cur = this.head;
			// traverse to the end of the list
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	/*
	 * Method to add a node at the specified position in the list
	 */
	public void add(int position, int data) {
		System.out.println("Add a node with data " + data + " at the position " + position);
		// Create a new node
		Node newNode = new Node(data);

		// Init the cur and prev nodes to the head
		Node cur = this.head, prev = this.head;

		if (position == 1) {
			// Point the new node's next to head
			newNode.next = head;
			// Make the new node as head
			this.head = newNode;
			return;
		}

		// traverse to the end of the list and check positions moved
		while (cur.next != null && --position > 0) {
			// update the prev and cur references
			prev = cur;
			cur = cur.next;
		}

		// update prev to point to new node
		prev.next = newNode;

		// & new node to point to current node
		newNode.next = cur;
	}

	/*
	 * Method to delete the first occurrence of data in the list
	 */
	public void deleteFirstOccurenceOfData(int data) {
		System.out.println("Deleting First Occurance of data " + data + " from the list");
		// Check if the list is empty
		if (this.head == null) {
			System.out.println("The List is empty.\n");
			return;
		}

		// Init the cur and prev nodes to the head
		Node cur = this.head, prev = this.head;

		// If the data is found at the first node
		// assign the reference of current head's next to head
		if (this.head.data == data) {
			this.head = this.head.next;
			return;
		}

		// Traverse the list until it ends or you
		// find the node that holds the data
		while (cur != null && cur.data != data) {

			// update the prev and cur references
			prev = cur;
			cur = cur.next;
		}

		// If the node was found, adjust the prev reference
		// to point to the next of the node to be deleted.
		if (cur != null) {
			prev.next = cur.next;
		} else {
			System.out.println("The data " + data + " could not be found in the List");
		}
	}

	/*
	 * Method to display the nodes of the singly linked list
	 */
	public void print() {
		if (this.head == null) {
			System.out.println("The List is empty.");
		} else {
			System.out.println("The contents of the Singly Linked List are : ");
			Node cur = this.head;
			while (cur != null) {
				System.out.print(cur.data + " -> ");
				cur = cur.next;
			}
			System.out.println("NULL\n");
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		for (int i = 1; i <= 8; i++) {
			singlyLinkedList.addNodeAtTheEnd(i);
		}
		singlyLinkedList.print();
		singlyLinkedList.deleteFirstOccurenceOfData(1);
		singlyLinkedList.print();
		singlyLinkedList.deleteFirstOccurenceOfData(8);
		singlyLinkedList.print();
		singlyLinkedList.deleteFirstOccurenceOfData(4);
		singlyLinkedList.print();
	}

}
