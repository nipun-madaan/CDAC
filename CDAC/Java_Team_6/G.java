class G{
	int i=10;
	static int j=20;
	public static void main(String[] args){
		G g = new G();
		g.fun();
		System.out.println("main");
	}
	
	void fun(){
		System.out.println("fun");
		System.out.println(this.i);
		System.out.println(this.j);
		this.test();
	}
	
	void test(){
		System.out.println("test");
	}
}