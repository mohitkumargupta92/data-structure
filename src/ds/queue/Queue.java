package ds.queue;

import java.util.Arrays;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front; // index position for the element in the front
	private int rear; // index position for the element in the back
	private int nItems;

	public Queue(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.queueArray = new long[maxSize];
		front = 0; // index position of first element
		rear = -1;
		nItems = 0;

	}

	public void insert(long element) {
		// if(isFull()) // normal Queue
		if (maxSize - 1 == rear) { // circular queue
			rear = -1;
		}
		rear++;
		nItems++;
		queueArray[rear] = element;

	}

	public long remove() {
		long element = queueArray[front];
		front++;
		if (front == maxSize) {
			front = 0;

		}
		nItems--;
		return element;

	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public long peekFront() {
		return queueArray[front];
	}

	public void view() {
		System.out.println("Queue [maxSize=" + maxSize + ", queueArray=" + Arrays.toString(queueArray) + ", front="
				+ front + ", rear=" + rear + ", nItems=" + nItems + "]");
	}

	@Override
	public String toString() {
		return "Queue [maxSize=" + maxSize + ", queueArray=" + Arrays.toString(queueArray) + ", front=" + front
				+ ", rear=" + rear + ", nItems=" + nItems + "]";
	}

}
