class ZZZZ{
	public static void main(String[] args){
		String s = " Mumbai ";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.length());
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		String s1 = "I am LMMSSLMMM";
		String s2[] = s1.split(" ");
		for(int i=0;i<s2.length;i++){
			System.out.println(s2[i]);
		}
		
		String s3 = " Laxman missing";
		System.out.println(s3.startsWith(" L"));
		System.out.println(s3.endsWith("g"));
		char ss[] = s3.toCharArray();
		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}
}