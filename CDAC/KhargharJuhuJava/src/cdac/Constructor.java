package cdac;

import java.util.Scanner;
class Constructor{
	int x;
	int y;
	/*{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		x=a;
		y=b;
	}*/
	Constructor(){  //Default constructor
	
	}
	
	Constructor(int x,int y){  //2 parameterized constructor
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args){
		Constructor j1 = new Constructor();
		System.out.println(j1.x);
		System.out.println(j1.y);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Constructor j2 = new Constructor(a,b);
		System.out.println(j2.x);
		System.out.println(j2.y);
		sc.close();
	}
}