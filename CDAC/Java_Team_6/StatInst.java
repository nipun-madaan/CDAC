class StatInst{
	int i=10;
	static int j=20;
	int k=30;
	
	public static void main(String [] args){
		StatInst s1 = new StatInst();
		StatInst s2 = new StatInst();
		s1.i++;
		System.out.println(s1.i);    //11
		s2.j++;
		System.out.println(s1.j);    //21
		s2.k++;
		System.out.println(s1.k);    //30
		s1.k++;
		System.out.println(s2.i);    //10
		s1.j++;
		System.out.println(s2.j);    //22
		System.out.println(s2.k);    //31
	}
}