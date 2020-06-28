class Static{
	static int i=5;
	static int j=10;
	
	public static void main(String[] args){
		Static s1 = new Static();
		Static s2 = new Static();
		s1.i++;
		System.out.println(i);
		System.out.println(Static.j);
		s2.j++;
		System.out.println(s1.j);    //s1 will be replaced by Static  (Static.j)
	}
}