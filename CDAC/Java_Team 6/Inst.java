class Inst{
	int i=10;
	int j=20;
	
	public static void main(String[] args){
		Inst i1 = new Inst();
		Inst i2 = new Inst();
		i1.j++;
		i2.i++;
		System.out.println("i1's i = "+i1.i);
		System.out.println("i1's j = "+i1.j);
		System.out.println("i2's i = "+i2.i);
		System.out.println("i2's j = "+i2.j);
	}
}