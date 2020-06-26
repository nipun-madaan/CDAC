class StatInstFn{
	int i=10;
	static int j=20;
	static StatInstFn s3;
	void fun(){
		StatInstFn s1 = new StatInstFn();
		s3.i++;
		System.out.println("s1's i : "+s1.i);
		System.out.println("s's i : "+i);    //internally calls this.i    
		System.out.println("j : "+j);
		//System.out.println(s2.i);   //error because s2 is local reference variable in test()
		System.out.println("s3's i : "+s3.i);
	}
	static void test(){
		StatInstFn s2 = new StatInstFn();
		s3.i++;
		System.out.println("s2's i : "+s2.i);
		//System.out.println(i);		//error we need the object of class
		System.out.println("j : "+j); 
		System.out.println("s3's i : "+s3.i);
	}
	public static void main(String[] args){
		StatInstFn s = new StatInstFn();
		s3= new StatInstFn();
		System.out.println("s's i : "+s.i);
		s.i++;
		s3.i++;
		System.out.println("j : "+j);
		s.fun();
		StatInstFn.test();
		System.out.println("s3's i : "+s3.i);
	}
}