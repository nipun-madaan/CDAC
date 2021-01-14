package edac_data_structure;

import java.util.Scanner;

class Node{
	
	String data;
	Node next;
	Node(){
		this.data = null;
		this.next = null;
	}
	
	Node(String data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListEx {

	Node head;
	
	LinkedListEx(){
		head=null;
	}
	
	boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	void addAtLast(String data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next = newNode;
		}
		System.out.println(data+" added successfully in the group!!!");
	}
	
	void addAtBeg(String data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;
		}
		System.out.println(data+" added successfully in the group!!!");
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println("Group is empty!!!");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
}
public class LinkedListMain{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListEx ll = new LinkedListEx();
		int choice;
		String data;
		do {
			System.out.println("0. Exit\n1. Display\n2. Add at last\n3. Add at first");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exit");
				System.exit(0);
				break;
			case 1:
				ll.display();
				break;
			case 2:
				data = sc.next();
				ll.addAtLast(data);
				break;
			case 3:
				data = sc.next();
				ll.addAtBeg(data);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}while(choice != 0);
		sc.close();
	}
}