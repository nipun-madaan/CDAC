package cdac;

class ConcatExample{
	public static void main(String[] args){
		int a=5;
		int b=10;
		int c=15;
		System.out.println(a+b);   //15
		System.out.println(a+b+" Sum");  //15 Sum
		System.out.println("Sum "+a+b);  //Sum 510
		System.out.println(a+b+"Sum"+c);  //15Sum15
		System.out.println(a+"Sum"+b+c);  //5Sum1015
		System.out.println(a+" "+b+" "+c);  //5 10 15
	
	}
}