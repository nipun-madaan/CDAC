package edac_data_structure;

import java.util.Scanner;

/*class Node{
	
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
}*/
class CircularLinkedList{
	Node head;
	
	CircularLinkedList(){
		head=null;
	}
	
	void addAtLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			newNode.next = head;
		}else {
			Node temp = head;
			while(temp.next != head) {
				temp=temp.next;
			}
			temp.next = newNode;
			newNode.next=head;
		}
		System.out.println(data+" added successfully in the group!!!");
	}
	
	void addAtBeg(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			newNode.next = head;
		}else {
			newNode.next = head;
			Node temp = head;
			while(temp.next != head) {
				temp=temp.next;
			}
			temp.next = newNode;
			head=newNode;
		}
		System.out.println(data+" added successfully in the group!!!");
	}
	
	void addAfterData(String data,String after) {
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println(after+" not found");
		}else {
			Node temp=head;
			boolean found = false;
			do{
			  	if(temp.data.equals(after)) {
					found = true;
					break;
				}
			  	temp=temp.next;
			}while(temp != head);
			 
			if(!found) {
				System.out.println(after + "not found!!!");
			}else {
				newNode.next = temp.next;
				temp.next = newNode;
				System.out.println(data+" added successfully in the group!!!");
			}
		}
	}
	
	void display() {
		if(head == null) {
			System.out.println("Group is empty!!!");
		}else {
			Node temp = head;
			do {
				System.out.print(temp.data+"--->");
				temp = temp.next;
			}while(temp != head);
			System.out.println(head.data);
		}
	}
}
public class CircularLinkedListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularLinkedList ll = new CircularLinkedList();
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
				//ll.deleteFromStart();
				break;
			case 6:
				//ll.deleteFromEnd();
				break;
			case 7:
				System.out.println("Enter the data");
				data = sc.next();
				//ll.deleteParticularData(data);
				break;
			default:
				System.out.println("Enter correct choice");
			}
		}while(choice != 0);
		sc.close();
	}
}
