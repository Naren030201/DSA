package com.revature.dsa.singlyLinkedList;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		singlyLinkedList list = new singlyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);
		Node node = list.getHead();
		int sum=0;
		while(node!=null) {
			sum+=node.getA();
			node=node.getNext();
		}
		System.out.println(sum);
	}

}
