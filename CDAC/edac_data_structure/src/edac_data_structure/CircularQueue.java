package edac_data_structure;

import java.util.Scanner;

public class CircularQueue {

	private int[] arr;
	private int size;
	private int front;
	private int rear;
	private int count;
	
	CircularQueue(){
		arr = new int[0];
		size=count=0;
		front = rear = -1;
	}
	
	CircularQueue(int size){
		this.size=size;
		arr = new int[size];
		front=rear=-1;
		count = 0;
	}
	
	void enqueue(int data) {
		if(count == size) {
			System.out.println("Queue is full!!!");
		}else {
			if(front ==-1 && rear == -1) {
				front++;
				rear++;
				arr[rear]=data;
				count++;
				System.out.println(data+" added successfully!!!");
			}else {
				if(rear == size-1)
					rear=0;
				else
					rear++;
				arr[rear]=data;
				count++;
				System.out.println(data+" added successfully!!!");
			}
		}
	}
	
	void dequeue() {
		if(count == 0) {
			System.out.println("Queue is empty!!!");
		}else {
			System.out.println(arr[front]+" removed successfully!!!");
			if(front == size-1) {
				front=0;
			}else
				front++;
			count--;
		}
	}
	
	void print() {
		if(count == 0) {
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
		CircularQueue q = new CircularQueue(size);
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
