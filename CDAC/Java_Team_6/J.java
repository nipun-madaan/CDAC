class J extends I{
	int i=75;
	J(){
		super();     //if super keyword is not there compiler provide it with default constructor
		System.out.println("J");
	}
	
	J(int i,int j){
		super(i);
		this.i=j;
		System.out.println("J(int,int)");
	}
	public static void main(String[] args){
		J j = new J();
		j.test();
		J j1 = new J(100,200);
		j1.test();
		System.out.println("J::main");
	}
	
	void test(){
		System.out.println(super.i+" "+this.i);
	}
}