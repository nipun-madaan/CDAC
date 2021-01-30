package edac_data_structure;

import java.util.Scanner;

public class DoubleEndedQueue {

	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	DoubleEndedQueue(){
		arr = new int[0];
		size=0;
		front = rear = -1;
	}
	
	DoubleEndedQueue(int size){
		arr = new int[size];
		this.size = size;
		front = rear = -1;
	}
	
	void enqueueAtFront(int data) {
		if(front == 0 && rear == size-1) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear]=data;
			System.out.println(data+" added successfully!!!");
		}else {
			if(front>0) {
				front--;
				arr[front]=data;
				System.out.println(data+" added successfully!!!");
			}else {
				System.out.println(data+ " can not be added!!!");
			}
		}
	}
	
	void enqueueAtRear(int data) {
		if(front == 0 && rear == size-1) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear]=data;
			System.out.println(data+" added successfully!!!");
		}else {
			if(rear<size-1) {
				rear++;
				arr[rear]=data;
				System.out.println(data+" added successfully!!!");
			}else {
				System.out.println(data+ " can not be added!!!");
			}
		}
	}
	
	void dequeueFromFront() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(front>rear) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[front]+" removed successfully!!!");
			front++;
		}
	}
	
	void dequeueFromRear() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(front>rear) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[rear]+" removed successfully!!!");
			rear--;
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
		DoubleEndedQueue q = new DoubleEndedQueue(size);
		int data,choice=0;
		
		while(choice != 6) {
			System.out.println("1. Enqueue at front\n2. Enqueue at rear\n3. Dequeue from front\n4. Dequeue from rare\n5. Print\n6. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the data:");
				data = sc.nextInt();
				q.enqueueAtFront(data);
				break;
			case 2:
				System.out.println("Enter the data:");
				data = sc.nextInt();
				q.enqueueAtRear(data);
				break;
			case 3:
				q.dequeueFromFront();
				break;
			case 4:
				q.dequeueFromRear();
				break;
			case 5:
				q.print();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
		sc.close();
	}
}
