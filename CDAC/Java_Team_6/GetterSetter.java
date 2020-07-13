class DF{
	private int i;
	int getI(){
		return i;
	}
	void setI(int i){
		this.i=i;
	}
}
class DH{
	public static void main(String[] args){
		DF d = new DF();
		System.out.println(d.getI());    //0
		d.setI(10);
		System.out.println(d.getI());    //10
	}
}