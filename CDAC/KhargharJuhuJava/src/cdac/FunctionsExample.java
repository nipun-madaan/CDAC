package cdac;

public class FunctionsExample{
	static int i = 10;
	int j = 20;
	static void fun(){
		FunctionsExample f = new FunctionsExample();
		System.out.println(i);
		System.out.println(f.j);
	}
	
	void sum(){
		FunctionsExample f1 = new FunctionsExample();
		f1.j=30;
		System.out.println(i);
		System.out.println(j);  //this.j
	}
	public static void main(String[] args){
		FunctionsExample f = new FunctionsExample();
		System.out.println(i);
		System.out.println(f.j);
		fun();
		f.sum();
	}
}