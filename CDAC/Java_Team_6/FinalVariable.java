class J1{
	static final int x;
	final int y;
	static{
		x=50;
	}
	{
		//y=100;
	}
	J1(){
		y=200;
	}
	
	J1(int y){
		this.y=y;
	}
	public static void main(String[] args){
		final int i;
		i=10;
		//i=20;     //error due to reintialisation
		//i++;      //error final variable can't be inceremented or decremented
		System.out.println(i);
		//x++;
		//x=10;
		System.out.println(x);
		J1 j = new J1(100);
		//j.y=20;
		//j.y++;
		System.out.println(j.y);
	}
}