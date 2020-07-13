final class Immutable{
	final private int i;
	Immutable(int i){
		this.i = i;
	}
	int getI(){
		return i;
	}
	public static void main(String[] args){
		Immutable im = new Immutable(5);
		//im.i=10;
		System.out.println(im.getI());
	}
}
