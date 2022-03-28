package io.murad.queue;

public class Queue {

	int size = 5;
	int items[] = new int[size];
	int front;
	int rear;

	public Queue() {
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			} else {
				rear++;
				items[rear] = element;
				System.out.println("Inserted " + element);
			}
		}
	}

	public int dequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = items[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println("Deleted -> " + element);
			return (element);
		}
	}

	public void display() {
		// Function to display elements of queue
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Front index-> " + front);
			System.out.println("Items -> ");
			for (i = front; i <= rear; i++) {
				System.out.println(items[i] + " ");
			}
			System.out.println("\nRear index-> " + rear);
		}
	}

	public static void main(String[] args) {

		Queue q = new Queue();

		// dequeue is not possible on empty queue
		q.dequeue();
		
		// enqueue 5 elements
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);

		// 6th element can't be added to because the queue is full
		q.enqueue(6);

		q.display();

		// dequeue removes element entered first i.e. 1
		q.dequeue();

		// Now we have just 4 elements
		q.display();
	}

}
