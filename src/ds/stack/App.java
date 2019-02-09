package ds.stack;

public class App {

	public static void main(String[] args) {

		Stack theStack = new Stack(10);
		for (int i = 0; i < 12; i++) {
			System.out.println("Loop Counter: " + i);
			theStack.push(i);
		}

		/*
		 * theStack.push(20); theStack.push(40); theStack.push(60); theStack.push(80);
		 */

		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.println("Values: " + value);
			System.out.println(theStack);
		}

		System.out.println();
		System.out.println(theStack);
	}

}
