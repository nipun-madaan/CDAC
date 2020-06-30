class H{
	int i,j;
	H(int i,int j){
		this(j);
		this.i = i;
		System.out.println("H(int,int)");
	}
	
	H(int j){
		this();
		this.j = j;
		System.out.println("H(int)");
	}
	
	H(){
		System.out.println("H()");
	}
	
	public static void main(String[] args){
		H h = new H(10,20);
		System.out.println(h.i+" "+h.j);
	}
}