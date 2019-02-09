package ds.stack.assignment;

import java.util.Arrays;

public class ReverseWord {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public ReverseWord(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackArray = new char[maxSize];
		top = -1;
	}

	public void push(char element) {

		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			this.stackArray[top] = element;
		}

	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}

	}

	public long peek() {
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
		return "ReverseWord [maxSize=" + maxSize + ", stackArray=" + Arrays.toString(stackArray) + ", top=" + top + "]";
	}

}
