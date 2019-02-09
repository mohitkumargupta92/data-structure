package ds.stack;

import java.util.Arrays;

public class Stack {

	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}

	public void push(long element) {

		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			this.stackArray[top] = element;
		}

	}

	public long pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}

	}

	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}

	@Override
	public String toString() {
		return "Stack [maxSize=" + maxSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top + "]";
	}

}
