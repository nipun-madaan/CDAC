class FunctionOverloading{
	static void sum(int a, int b){
		System.out.println("Add: "+(a+b));
	}
	
	static void sum(int a, int b, int c){
		System.out.println("Add: "+(a+b+c));
		return 0;
	}
	
	static void main(){  //main can be overloaded
		System.out.println("main");
	}
	public static void main(String[] args){
		sum(10,20);
		//FunctionOverloading f = new FunctionOverloading();
		//f.sum(10,20,30);
		sum(10,20,30);
		main();
	}
}