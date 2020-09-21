package cdac;

public class Demo {

	static int i = 10;
	int j = 20;
	
	static void fun(Demo d) {
		d.i++;
		d.j++;
	}
	void stay() {
		this.j++;
		this.i++;
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		System.out.println(d1.i);   //10
		System.out.println(d1.j);   //20
		System.out.println(d2.i);   //10
		System.out.println(d2.j);   //20
		fun(d1);
		System.out.println(d1.i);    //11
		System.out.println(d1.j);    //21
		System.out.println(d2.i);    //11
		System.out.println(d2.j);    //20
		fun(d2);
		System.out.println(d1.i);    //12
		System.out.println(d1.j);    //21
		System.out.println(d2.i);    //12
		System.out.println(d2.j);    //21
		d1.stay();
		System.out.println(d1.i);   //13
		System.out.println(d1.j);    //22
		System.out.println(d2.i);   //13
		System.out.println(d2.j);   //21
		d2.stay();
		System.out.println(d1.i);  //14
		System.out.println(d1.j);  //22
		System.out.println(d2.i);  //14
		System.out.println(d2.j);  //22
	}

}
