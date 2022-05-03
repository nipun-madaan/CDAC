import java.util.*;
class Stack{
	private int[] arr;
	private int size;
	private int top;
	
	Stack(int size){
		this.size=size;
		arr = new int[size];
		top=-1;
	}
	boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}
	
	boolean isFull(){
		if(top == size - 1){
			return true;
		}else{
			return false;
		}
	}
	
	void push(int x){
		if(isFull()){
			System.out.println("Stack is full");
		}else{
			top++;
			arr[top]=x;
			System.out.println(x+" pushed");
		}
	}
	
	void pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			int x = arr[top];
			System.out.println(x+" poped");
			top--;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}else{
			for(int i=0;i<=top;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("Enter the size of stack:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack s = new Stack(size);
		while(true){
			System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter the no:");
					int num = sc.nextInt();
					s.push(num);
					break;
				case 2:
					s.pop();
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