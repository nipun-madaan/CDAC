package dataStructure;

import java.util.Scanner;

public class Stack {
	
	private int[] arr;
	private int top;
	private int size;
	
	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	boolean isFull() {
		if(top == size-1)
			return true;
		else
			return false;
	}
	
	void push(int data) throws Exception {
		if(!isFull()) {
			arr[++top] = data;
			System.out.println(data+" inserted successfully!");
		}else
			throw new Exception("Stack is full!!");
	}
	
	int pop() throws Exception{
		if(!isEmpty())
			return arr[top--];
		else
			throw new Exception("Stack is empty!!");
	}
	
	int peek() throws Exception{
		if(!isEmpty())
			return arr[top];
		else
			throw new Exception("Stack is empty!!");
	}
	
	void display() throws Exception{
		if(!isEmpty()) {
			for(int i=0;i<=top;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}else
			throw new Exception("Stack is empty!!");
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the size of the stack:");
		Scanner sc = new Scanner(System.in);
		int size,choice,data,element;
		size = sc.nextInt();
		Stack s = new Stack(size);
		while(true) {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("Enter the data to be pushed");
					data = sc.nextInt();
					s.push(data);
					break;
				case 2:
					element = s.pop();
					System.out.println("Poped element is "+element);
					break;
				case 3:
					element = s.peek();
					System.out.println("Element at top is "+element);
					break;
				case 4:
					s.display();
					break;
				case 5:
					System.exit(0);
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
