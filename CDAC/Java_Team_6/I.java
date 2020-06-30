class I{
	int i=50;
	I(){
		System.out.println("I");
	}
	
	I(int i){
		this.i=i;
		System.out.println("I(int)");
	}
	
	public static void main(String[] args){
		System.out.println("I::main");
	}
}