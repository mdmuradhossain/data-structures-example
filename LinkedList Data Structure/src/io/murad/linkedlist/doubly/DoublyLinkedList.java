package io.murad.linkedlist.doubly;

public class DoublyLinkedList {

	// node creation
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	// insert node at the front
	public void insertFront(int data) {
		// allocate memory for newNode and assign data to newNode
		Node newNode = new Node(data);

		// make newNode as a head
		newNode.next = head;

		// assign null to prev of newNode
		newNode.prev = null;

		// previous of head (now head is the second node) is newNode
		if (head != null) {
			head.prev = newNode;
		}
		// head points to newNode
		head = newNode;
	}

	// insert a node after a specific node
	public void insertAfter(Node prevNode, int data) {

		// check if previous node is null
		if (prevNode == null) {
			System.out.println("previous node cannot be null");
			return;
		}

		// allocate memory for newNode and assign data to newNode
		Node newNode = new Node(data);

		// set next of newNode to next of prev node
		newNode.next = prevNode.next;

		// set next of prev node to newNode
		prevNode.next = newNode;

		// set prev of newNode to the previous node
		newNode.prev = prevNode;

		// set prev of newNode's next to newNode
		if (newNode.next != null)
			newNode.next.prev = newNode;
	}

	// insert a newNode at the end of the list
	void insertEnd(int data) {
		// allocate memory for newNode and assign data to newNode
		Node newNode = new Node(data);

		// store the head node temporarily (for later use)
		Node temp = head;

		// assign null to next of newNode
		newNode.next = null;

		// if the linked list is empty, make the newNode as head node
		if (head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}

		// if the linked list is not empty, traverse to the end of the linked list
		while (temp.next != null)
			temp = temp.next;

		// assign next of the last node (temp) to newNode
		temp.next = newNode;

		// assign prev of newNode to temp
		newNode.prev = temp;
	}

	// delete a node from the doubly linked list
	void deleteNode(Node delNode) {

		// if head or del is null, deletion is not possible
		if (head == null || delNode == null) {
			return;
		}

		// if del_node is the head node, point the head pointer to the next of del_node
		if (head == delNode) {
			head = delNode.next;
		}

		// if del_node is not at the last node, point the prev of node next to del_node
		// to the previous of del_node
		if (delNode.next != null) {
			delNode.next.prev = delNode.prev;
		}

		// if del_node is not the first node, point the next of the previous node to the
		// next node of del_node
		if (delNode.prev != null) {
			delNode.prev.next = delNode.next;
		}

	}

	// print the doubly linked list
	public void printlist(Node node) {
		Node last = null;
		while (node != null) {
			System.out.print(node.data + "->");
			last = node;
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

		doublyLinkedList.insertEnd(5);
		doublyLinkedList.insertFront(1);
		doublyLinkedList.insertFront(6);
		doublyLinkedList.insertEnd(9);

		// insert 11 after head
		doublyLinkedList.insertAfter(doublyLinkedList.head, 11);

		// insert 15 after the seond node
		doublyLinkedList.insertAfter(doublyLinkedList.head.next, 11);

		doublyLinkedList.printlist(doublyLinkedList.head);

		// delete the last node
		doublyLinkedList.deleteNode(doublyLinkedList.head.next.next.next.next.next);

		doublyLinkedList.printlist(doublyLinkedList.head);
	}

}
