package edac_data_structure;

import java.util.Scanner;

public class DoubleEndedCircularQueue {

	private int arr[];
	private int size;
	private int front;
	private int rear;
	private int count;
	
	DoubleEndedCircularQueue(){
		arr = new int[0];
		size=0;
		front=rear=count=0;
	}
	
	DoubleEndedCircularQueue(int size){
		this.size=size;
		arr = new int[size];
		front=rear=-1;
		count=0;
	}
	
	void enqueueAtFront(int data) {
		if(count == size) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[front]=data;
			count++;
			System.out.println(data+" added successfully!!!");
		}else {
			if(front == 0)
				front = size-1;
			else
				front--;
			arr[front]=data;
			count++;
			System.out.println(data+" added successfully!!!");
		}
	}
	
	void enqueueAtRear(int data) {
		if(count == size) {
			System.out.println("Queue is full!!!");
		}
		else if(front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear]=data;
			count++;
			System.out.println(data+" added successfully!!!");
		}else {
			if(rear==size-1) 
				rear=0;
			else
				rear++;
			arr[rear]=data;
			count++;
			System.out.println(data+" added successfully!!!");	
		}
	}
	
	void dequeueFromFront() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(count==0) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[front]+" removed successfully!!!");
			if(front == size-1)
				front = 0;
			else
				front++;
			count--;
		}
	}
	
	void dequeueFromRear() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(count == 0) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[rear]+" removed successfully!!!");
			if(rear == 0)
				rear = size-1;
			else
				rear--;
			count--;
		}
	}
	
	void print() {
		if(front == -1 && rear == -1)
			System.out.println("Queue is empty!!!");
		else if(count == 0) {
			System.out.println("Queue is empty!!!");
		}else {
			int j = front;
			for(int i=1;i<=count;i++) {
				System.out.print(arr[j]+" ");
				if(j == size-1)
					j=0;
				else
					j++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue:");
		int size = sc.nextInt();
		DoubleEndedCircularQueue q = new DoubleEndedCircularQueue(size);
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
