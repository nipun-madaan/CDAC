class YYY{
	public static void main(String[] args){
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = new String("abc");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		String s4 = new String("bcd");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		s4=s3;
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		s1=null;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}