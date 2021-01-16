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
	
	void addAfterData(String data,String after) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			System.out.println(after+" not found");
		}else {
			Node temp=head;
			while(!temp.data.equals(after)) {
				if(temp.next == null) {
					break;
				}
				temp=temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println(data+" added successfully in the group!!!");
		}
	}
	void deleteFromStart() {
		if(isEmpty()) {
			System.out.println("Group is empty!!!");
		}else {
			Node temp = head.next;
			System.out.println(head.data + " removed from group!!!");
			head = temp;
		}
	}
	
	void deleteFromEnd() {
		if(isEmpty()) {
			System.out.println("Group is empty!!!");
		}else {
			Node temp = head;
			while(temp.next != null && temp.next.next != null) {
				temp=temp.next;
			}
			if(temp.next != null) {
				System.out.println(temp.next.data + " removed from group!!!");
				temp.next = null;
			}else {
				System.out.println(temp.data + " removed from group!!!");
				head=null;
			}
		}
	}
	
	void deleteParticularData(String data) {  //Prabhanshu 
		if(isEmpty()) {
			System.out.println("Group is empty!!!");
		}else {
			Node temp=head;
			if(head.data.equals(data)) {
				deleteFromStart();
			}else {
				while(temp.next != null && !temp.next.data.equals(data)) {
					temp = temp.next;
				}
				if(temp.next != null) {
					Node temp1=temp.next.next;    //temp.next = temp.next.next;
					System.out.println(temp.next.data + " removed from group!!!");
					temp.next = temp1;
				}else {
					System.out.println(data+" not found!!!");
				}
				
			}
		}
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
		String data,val;
		do {
			System.out.println("0. Exit\n1. Display\n2. Add at last\n3. Add at first\n4. Add after data"
					+ "\n5. Delete from start\n6. Delete from end\n7. Delete particular data");
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
				System.out.println("Enter the data");
				data = sc.next();
				ll.addAtLast(data);
				break;
			case 3:
				System.out.println("Enter the data");
				data = sc.next();
				ll.addAtBeg(data);
				break;
			case 4:
				System.out.println("Enter the data");
				data = sc.next();
				System.out.println("Added after which data");
				val=sc.next();
				ll.addAfterData(data, val);
				break;
			case 5:
				ll.deleteFromStart();
				break;
			case 6:
				ll.deleteFromEnd();
				break;
			case 7:
				System.out.println("Enter the data");
				data = sc.next();
				ll.deleteParticularData(data);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}while(choice != 0);
		sc.close();
	}
}