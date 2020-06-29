class D{
	D(){
		new D();
		System.out.println("D");   //it will go in infinite loop
	}
	public static void main(String[] args){
		new D();
	}
}