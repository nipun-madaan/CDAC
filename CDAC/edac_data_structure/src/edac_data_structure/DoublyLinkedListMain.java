package edac_data_structure;

import java.util.Scanner;

class Node{
	String data;
	Node next;
	Node prev;
	
	Node(String data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
class DoublyLinkedList{
	
	Node head;
	
	DoublyLinkedList(){
		head = null;
	}
	
	void addAtLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp=head;
			while(temp.next != null)
				temp=temp.next;
			
			temp.next=newNode;
			newNode.prev=temp;
		}
		System.out.println(data+" added to the group!!!");
	}
	
	void addAtBeg(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			newNode.next=head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println(data+" added to the group!!!");
	}
	
	void addAfterData(String data,String after) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			System.out.println(data+" added to the group!!!");
		}else {
			Node temp=head;
			while(temp != null && !temp.data.equals(after)) {
				temp = temp.next;
			}
			if(temp.next == null) {
				addAtLast(data);
			}else {
				newNode.next = temp.next;
				newNode.prev=temp;
				temp.next.prev=newNode;
				temp.next=newNode;
				System.out.println(data+" added to the group!!!");
			}
		}
		
	}
	
	void deleteFromStart() {
		if(head == null) {
			System.out.println("group is empty!!!");
		}else {
			System.out.println(head.data + " removed from group!!!");
			head = head.next;
			if(head != null)
				head.prev=null;
			
		}
	}
	
	void deleteFromEnd() {
		if(head == null) {
			System.out.println("group is empty!!!");
		}else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			System.out.println(temp.data + " removed from group!!!");
			if(temp.prev == null)
				head=null;
			else
				temp.prev.next=null;
		}
	}
	
	void deleteParticularData(String data) {
		if(head == null) {
			System.out.println("group is empty!!!");
		}else {
			Node temp=head;
			while(temp != null && !temp.data.equals(data)) {
				temp=temp.next;
			}
			if(temp == null)
				System.out.println(data+" not found!!!");
			else if(temp.prev==null) {
				deleteFromStart();
			}else if(temp.next == null) {
				deleteFromEnd();
			}else {
				temp.prev.next = temp.next;
				temp.next.prev=temp.prev;
				System.out.println(temp.data + " removed from group!!!");
			}
		}
	}
	void display() {
		if(head == null) {
			System.out.println("group is empty!!!");
		}else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	void reverse() {
		if(head == null) {
			System.out.println("group is empty!!!");
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp=temp.next;
			}
			while(temp != null) {
				System.out.print(temp.data+"--->");
				temp=temp.prev;
			}
			System.out.println("null");
		}
	}
}
public class DoublyLinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList ll = new DoublyLinkedList();
		int choice;
		String data,val;
		do {
			System.out.println("0. Exit\n1. Display\n2. Add at last\n3. Add at first\n4. Add after data"
					+ "\n5. Delete from start\n6. Delete from end\n7. Delete particular data\n8. Reverse");
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
			case 8:
				ll.reverse();
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}while(choice != 0);
		sc.close();
	}
}
