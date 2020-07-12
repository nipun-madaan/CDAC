interface AD{
	void test();
}
interface CD{
	void fun();
}
class FG{
	void extra(){
		System.out.println("FG::extra()");
	}
}
class BG extends FG implements AD,CD{
	public void test(){
		System.out.println("BG::test()");
	}
	public void fun(){
		System.out.println("BG::fun()");
	}
	public static void main(String[] args){
		BG b = new BG();
		b.fun();
		b.test();
		b.extra();
	}
}
