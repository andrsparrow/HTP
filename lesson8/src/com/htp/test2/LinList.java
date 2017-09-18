package com.htp.test2;

public class LinList {

	private int count;
	private Node tail;
	private Node head;
	private Node current;

	public Node getTail() {

		return tail;
	}

	public Node getHead() {

		return head;
	}

	public LinList() {
		count = 0;
		tail = head = null;

	}

	public void add(Object object) {
		count++;
		if (count == 1) {
			tail = new Node(object);
			head = tail;
		} else {

			tail.setNextNode(new Node(object));
			tail.getNextNode().setNextNode(null);

			tail = tail.getNextNode();
		}
	}

	public void addFirst(Object object) {
		count++;
		Node tempNext;
		Node temp = head;
		tempNext = head.getNextNode();

		head = new Node(object);

		head.setNextNode(temp);
		head.getNextNode().setNextNode(tempNext);

	}

	public void add(Object object, int index) {

		current = head;
		Node temp;
		// Node tempNext;
		Node prev = null;
		int counter = 0;

		if (index == 0) {
			addFirst(object);
			return;
		}
		count++;

		while (current != null) {
			if (counter == index) {
				// tempNext = current.getNextNode();
				temp = current;

				current = new Node(object);
				current.setNextNode(temp);
				if (counter != 0) {
					prev.setNextNode(current);
				}
			}
			prev = current;
			current = current.getNextNode();
			counter++;
		}

	}
	
	public void remove(int index){
		current = head;
		Node prev = null;
		int counter = 0;

		while (current != null) {
			if (counter == index) {
				if(counter!=0)
					prev.setNextNode(current.getNextNode());
				else
					head=head.getNextNode();
			}
			prev = current;
			current = current.getNextNode();
			counter++;
		}
		count--;
		
	}

	public Node get(int index){
		current = head;
		int counter = 0;

		while (current != null) {
			if (counter == index) {
				return current;
			}
			current = current.getNextNode();
			counter++;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		if (count == 0)
			return " no elements";

		String temp = "LinList (" + count + ")[ ";
		temp += head;
		Node tempp = head.getNextNode();
		while (tempp != null) {
			temp += tempp;
			tempp = tempp.getNextNode();
		}
		temp += " ]";
		return temp;
	}

}
