class Child extends Parent{
	public static void main(String[] args){
		new Child().test();
	}
	
	void test(){
		System.out.println(super.i);    //using super keyword i can access both 
		System.out.println(super.j);     //instance and static variable of parent class
		super.fun();
	}
}