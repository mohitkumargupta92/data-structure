package ds.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedLists list = new SinglyLinkedLists();

		for (int i = 0; i < 10; i++) {
			list.insertFirst(i);
		}
		
		list.insertLast(11);
		list.displayList();

		System.out.println("Length: " + list.listLength(null));

	}

}
