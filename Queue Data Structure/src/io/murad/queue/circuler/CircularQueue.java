package io.murad.queue.circuler;

public class CircularQueue {
	// Size of Circular Queue
	int size = 5;
	int front;
	int rear;
	int items[] = new int[size];

	public CircularQueue() {
		front = -1;
		rear = -1;
	}

	// Check if the queue is full
	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	// Check if the queue is empty
	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	// Adding an element
	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			items[rear] = element;
			System.out.println("Inserted " + element);

		}
	}

	// Removing an element
	public int dequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = items[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} // Q has only one element, so we reset the queue after deleting it.
			else {
				front = (front + 1) % size;
			}
			return (element);
		}
	}

	public void display() {
		// Function to display status of Circular Queue
		int i;
		if (isEmpty()) {
			System.out.println("Empty queue");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Items -> ");
			for (i = front; i != rear; i = (i + 1) % size) {
				System.out.println(items[i] + " ");
			}
			System.out.println(items[i]);
			System.out.println("Rear -> " + rear);
		}
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue();
		// Fails because front = -1
		cq.dequeue();

		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);

		// Fails to enqueue because front == 0 && rear == SIZE - 1
		cq.enqueue(6);

		cq.display();

		int elem = cq.dequeue();

		if (elem != -1) {
			System.out.println("Deleted Element is " + elem);
		}
		cq.display();
		cq.enqueue(7);
		cq.display();

		// Fails to enqueue because front == rear + 1
		cq.enqueue(8);
	}

}
