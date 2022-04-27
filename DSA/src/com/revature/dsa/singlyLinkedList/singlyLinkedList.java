package com.revature.dsa.singlyLinkedList;

public class singlyLinkedList {
private Node head;
private Node tail;
void add(int data) {
	Node node= new Node(data);
	if(head==null) {
		head=node;
		tail=node;
	}else {
		tail.setNext(node);
		tail=node;
	}
}

public Node getHead() {
	return head;
}

@Override
public String toString() {
	Node pointer = head;
	String res ="";
	while(pointer!=null) {
		res+= pointer.toString();
		pointer=pointer.getNext();
	}
	return res;
}


}
