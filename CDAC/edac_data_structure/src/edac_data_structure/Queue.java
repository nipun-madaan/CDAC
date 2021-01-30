package edac_data_structure;

import java.util.Scanner;

public class Queue {

	private int arr[];
	private int size;
	private int front;
	private int rear;
	Queue(){
		arr = new int[0];
		size=0;
		front = rear = -1;
	}
	
	Queue(int size) {
		this.size=size;
		arr = new int[size];
		front = rear = -1;
	}
	
	void enqueue(int data) {
		if(rear == size-1) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear]=data;
			System.out.println(data+" added successfully!!!");
		}else {
			rear++;
			arr[rear]=data;
			System.out.println(data+" added successfully!!!");
		}
	}
	
	void dequeue() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(front>rear) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[front]+" removed successfully!!!");
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
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue:");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		int data,choice=0;
		
		while(choice != 4) {
			System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the data:");
				data = sc.nextInt();
				q.enqueue(data);
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