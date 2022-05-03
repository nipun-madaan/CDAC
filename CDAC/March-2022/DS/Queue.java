import java.util.*;
class Queue{
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	Queue(int size){
		arr = new int[size];
		this.size = size;
		front = rear = -1;
	}
	
	boolean isEmpty(){
		if((front == -1 && rear == -1) || front> rear){
			return true;
		}else{
			return false;
		}
	}
	
	boolean isFull(){
		if(rear == size-1)
			return true;
		else
			return false;
	}
	
	public void enqueue(int x){
		if(isFull())
			System.out.println("Queue is full");
		else
		{
			if(front == -1 && rear == -1)
				front=0;
			rear++;
			arr[rear]=x;
			System.out.println(x+" enqueued");
		}
	}
	
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			int x = arr[front];
			front++;
			System.out.println(x+" dequeued");
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("Enter the size of queue:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Queue s = new Queue(size);
		while(true){
			System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter the no:");
					int num = sc.nextInt();
					s.enqueue(num);
					break;
				case 2:
					s.dequeue();
					break;
				case 3:
					s.display();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Enter valid choice");
					break;
			}
		}
	}
}