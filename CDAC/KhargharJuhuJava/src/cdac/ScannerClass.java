package cdac;
import java.util.Scanner;

class ScannerClass{
	static Scanner sc;
	static void sum() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+b);
	}
	public static void main(String[] args){
		sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();   //int
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		String d = sc.next(); //Nipun Madaan
		String e = sc.nextLine();
		System.out.println(a+" b="+b+" c="+c+" d="+d+" e="+e);
		//System.out.println(a+b+c+d+e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		sum();
		sc.close();
		
	}
}

//radius and area and circumference