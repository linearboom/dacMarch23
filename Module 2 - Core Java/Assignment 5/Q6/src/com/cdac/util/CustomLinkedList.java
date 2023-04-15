package com.cdac.util;

import java.util.Iterator;
import java.util.ListIterator;

public class CustomLinkedList<T> implements Iterable<T> {
	private Node head;
	private Node tail;

	public class Node {
		private T data;
		private Node next;

		public Node(T element) {
			this.data = element;
		}

	}

	public void AddItem(T element) {
		Node n1 = new Node(element);
		if (this.head != null) {
			this.tail.next = n1;
		} else {
			this.head = n1;
		}
		this.tail = n1;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}

	public void getItem() {
		for (T element : this) {
			System.out.println(element);
		}
	}
	/**
	 * Removes the first occurence of element 
	 * Compares the referecnes
	 * TODO : Implement .equals Method
	 */
	public void removeItem(T element) {
		if (this.isEmpty())
			return;
		Node current = head;
		if (current.data == element) {
			head = current.next;
			return;
		}
		while (current.next != null) {
			if (current.next.data == element) {
				current.next = current.next.next;
				return;
			}else {
				current = current.next;
			}
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		Iterator<T> iter = new ListIterator();
		return iter;
	}

	public class ListIterator implements Iterator<T> {
		private Node trav;

		public ListIterator() {
			this.trav = head;
		}

		@Override
		public boolean hasNext() {
			return this.trav != null;
		}

		@Override
		public T next() {
			T data = trav.data;
			trav = trav.next;
			return data;
		}

	}
}
