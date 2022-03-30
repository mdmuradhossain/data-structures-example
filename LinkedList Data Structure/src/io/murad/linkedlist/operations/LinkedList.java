package io.murad.linkedlist.operations;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// insert at the beginning
	public void insertAtBeginning(int newData) {
		// insert the data
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	// insert after a node
	public void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	public void insertAtEnd(int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = new Node(newData);
			return;
		}
		newNode.next = null;

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}

	// Delete a node
	public void deleteNode(int position) {
		if (head == null) {
			return;
		}
		Node temp = head;

		if (position == 0) {
			head = temp.next;
			return;
		}

		// Find the key to be deleted
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		}
		// if the key is not present
		if (temp == null || temp.next == null) {
			return;
		}
		// remove the node
		Node next = temp.next.next;
		temp.next = next;
	}

	// search a node
	public boolean search(Node head, int key) {
		Node current = head;
		while (current != null) {
			if (current.data == key) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Sort the linked list

	public void sortLinkedList(Node head) {
		Node current = head;
		Node index = null;
		int temp;

		if (head == null) {
			return;
		} else {
			while (current != null) {
				// index points to the node next to current
				index = current.next;

				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	// Print the linked list
	public void printList() {
		Node tnode = head;

		while (tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {

		LinkedList lList = new LinkedList();

		lList.insertAtEnd(1);
		lList.insertAtBeginning(2);
		lList.insertAtBeginning(2);
		lList.insertAtEnd(4);
		lList.insertAfter(lList.head.next, 5);

		System.out.println("Linked List: ");
		lList.printList();

		System.out.println("\nAfter deleting an element: ");
		lList.deleteNode(3);
		lList.printList();

		System.out.println();
		int itemToFind = 3;
		if (lList.search(lList.head, itemToFind)) {
			System.out.println(itemToFind + " is found");
		} else {
			System.out.println(itemToFind + " is not found");
		}

		lList.sortLinkedList(lList.head);
		System.out.println("\nSorted List: ");
		lList.printList();

	}

}
