package juhu;

import cdac.Base;

class Derived extends Base{
	//static int i
	protected static void sum(){
		System.out.println("Derived :: sum()");
	}
	public void sub(){
		System.out.println("Derived :: sub()");
	}
	public static void main(String[] args){
		System.out.println(i);
		Derived d = new Derived();
		System.out.println(d.j);
		sum();
		Base.sum();
		d.sub();
		Base b = new Base();
		b.sub();
		System.out.println(b.j);
	}
}