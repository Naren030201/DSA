package com.revature.dsa.singlyLinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Node {
private int a;
private Node next;
public Node(int a) {
	super();
	this.a = a;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
@Override
public String toString() {
	return "|"+ a+"|"+"->";
}
public static void main(String args[] ) {
	Node node1 = new Node (10);
	Node node2 = new Node(20);
	node1.setNext(node2);
	System.out.println(node1.getNext());
}
}

