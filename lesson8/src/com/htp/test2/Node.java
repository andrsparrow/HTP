package com.htp.test2;

public class Node{
	private	Object value;
	private	int index;
	private	Node nextNode;
	private Node prevNode;
	
	public Node(Object value) {
	              this.value = value;
	      }
	
	public Node(Object value, int index) {
	          this.value = value;
	          this.index=index;
	  }
		  
		  
		  
		  
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public Node getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}

		public Node getPrevNode() {
			return prevNode;
		}

		public void setPrevNode(Node prevNode) {
			this.prevNode = prevNode;
		}

		@Override
		public String toString() {
			return " (value=" + value + ")";
		}
		
		
		
	}
