package edu.monmouth.hw2;
import edu.monmouth.book.*;

public class ListNode {

	private Node head;
	private Book b;

	public ListNode() {
		head = null;
	}

	public Node removeFirst() {
		/* placeholder */
		return head;
		//

	}

	public Node first() {
		/* placeholder */
		return head;
	}

	public Node last() {
		/* placeholder */
		while(head.next != null) {
			
		}
		return null;
	}

	public void insert(Book B) {
		Node newNode = new Node(element);
		newNode.setNext(head);
		head = newNode;
	}

	public void insertEnd(String element) {
		/* placeholder */
		return; 
	}

	public boolean isEmpty() { 
		/* placeholder */
		return true;              
	}

	public int size() {
		/* placeholder */
		return 0;
	}

	public void clear() {
		head = null;
	}

	@Override
	public String toString() {
		StringBuilder logString = new StringBuilder();
		Node node;
		node = head;
		int count = 0;

		while (node != null) {
			count++;
			logString.append(count + " . " + node.getInfo() + "\n");
			node = node.getNext();
		}
		return logString.toString();
	}
}