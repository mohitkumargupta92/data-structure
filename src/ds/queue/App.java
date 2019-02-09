package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		for (int i = 0; i <= 100; i++) {
			queue.insert(i);
		}

		queue.view();

	}

}
