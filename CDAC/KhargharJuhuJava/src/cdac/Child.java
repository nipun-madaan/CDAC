class Child extends Parent{
	static int x=50;
	int y=100;
	public static void main(String[] args){
		System.out.println(x);  //50
		System.out.println(Parent.x);   //10
		Child c = new Child();
		System.out.println(c.y);    //100
		Parent p = new Parent();
		System.out.println(p.y);   //20
	}
	
}