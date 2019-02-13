package ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedLists list = new CircularLinkedLists();

		for (int i = 0; i <= 10; i++) {
			list.insertLast(i);
		}
		
		list.insertFirst(11);
		list.displayList();

		// System.out.println("Length: " + list.listLength(null));

	}

}
