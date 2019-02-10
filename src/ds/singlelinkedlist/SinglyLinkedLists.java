package ds.singlelinkedlist;

public class SinglyLinkedLists {
	private Node headNode;
	private Node tailNode;

	public void insertFirst(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			headNode = node;
			tailNode = node;
			return;
		}

		/*
		 * Node temp = headNode; headNode = node; headNode.setNextNode(temp);
		 */
		node.setNextNode(headNode);
		headNode = node;
	}

	public void insertLast(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			headNode = node;
			tailNode = node;
			return;
		}
		
		tailNode.setNextNode(node);
		tailNode = tailNode.getNextNode();
		/*Node temp = headNode;

		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}

		for (; temp.getNextNode() != null;)
			temp = temp.getNextNode();

		temp.setNextNode(node);*/
	}

	public Node deleteFirst() {
		if (isEmpty()) {
			return null;
		}

		Node temp = headNode;
		headNode = headNode.getNextNode();

		return temp;
	}

	public void displayList() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		System.out.println("List Content: ");

		Node temp = headNode;

		while (temp != null) {
			System.out.println("Node Data: " + temp.getData());
			temp = temp.getNextNode();
		}

		System.out.println("List end");

	}

	public int listLength(Node node) {
		int length = 0;
		if (node == null)
			node = headNode;
		while (node != null) {
			length++;
			node = node.getNextNode();
		}
		return length;
	}

	public boolean isEmpty() {
		return headNode == null;
	}

}
