package edac_data_structure;

import java.util.Scanner;

public class PriorityQueue {

	static class Node{
		String data;
		int priority;
		Node(String data,int priority){
			this.data = data;
			this.priority=priority;
		}
	}
	private Node arr[];
	private int size;
	private int front;
	private int rear;
	
	PriorityQueue(){
		arr = new Node[0];
		size=0;
		front=rear=-1;
	}
	
	PriorityQueue(int size){
		this.size=size;
		arr= new Node[size];
		front=rear=-1;
	}
	
	void enqueue(String data,int priority) {
		Node node=new Node(data,priority);
		if(rear == size-1) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear]=node;
			System.out.println(data+" added successfully!!!");
		}else {
			int i;
			for(i=rear;i>=front;i--) {
				if(priority<arr[i].priority) {
					arr[i+1]=arr[i];
				}else
					break;
			}
			arr[i+1]=node;
			rear++;
			System.out.println(data+" added successfully!!!");
		}
	}
	
	void dequeue() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(front>rear) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[front].data+" removed successfully!!!");
			front++;
		}
	}
	
	void print() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(front>rear) {
			System.out.println("Queue is empty!!!");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i].data+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue:");
		int size = sc.nextInt();
		PriorityQueue q = new PriorityQueue(size);
		int priority,choice=0;
		String data;
		
		while(choice != 4) {
			System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the data:");
				data = sc.next();
				System.out.println("Enter the priority:");
				priority = sc.nextInt();
				q.enqueue(data,priority);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.print();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
		sc.close();
	}
}
