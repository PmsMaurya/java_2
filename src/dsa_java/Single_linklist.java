package dsa_java;

import java.util.*;

public class Single_linklist {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
                                           // start creation
	public void creation() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter the data:");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if (head == null) {
				head = new_node;
			} else {
				new_node.next = head;
				head = new_node;
			}
			System.out.print("Do you want to add more data.if yes press 1:");
			n = sc.nextInt();
		} while (n == 1);
	}

	                                    // start traverser
	public void traverser() {
		Node temp = head;
		if (head == null) {
			System.out.println("Link list does not exist.");
		} else {
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		Single_linklist ll = new Single_linklist();
		ll.creation();
		ll.traverser();

	}

}
