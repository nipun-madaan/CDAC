class This{
	public static void main(String[] args){
		This t = new This();
		System.out.println(t);
		This t1 = new This();
		System.out.println(t1);
		t.test();
	}
	
	void test(){
		System.out.println(this);
	}
}	