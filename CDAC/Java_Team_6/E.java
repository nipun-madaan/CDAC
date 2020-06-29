class E{
	E(){
		System.out.println("E");
	}
	E(int i){
		new E();
		System.out.println("E(int)");
	}
	
	public static void main(String[] args){
		new E(100);
	}
}