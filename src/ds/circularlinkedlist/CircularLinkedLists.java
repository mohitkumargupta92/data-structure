package ds.circularlinkedlist;

import ds.singlelinkedlist.Node;

public class CircularLinkedLists {

	private Node headNode;
	private Node tailNode;

	public void insertFirst(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			headNode = node;
			tailNode = node;
			return;
		}

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

	}
	
	public Node deleteFirst() {
		if (isEmpty()) {
			return null;
		}

		Node temp = headNode;
		headNode = headNode.getNextNode();

		return temp;
	}

	public boolean isEmpty() {
		return headNode == null;
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

}
