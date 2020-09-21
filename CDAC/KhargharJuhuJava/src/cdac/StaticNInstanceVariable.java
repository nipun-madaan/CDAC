package cdac;

public class StaticNInstanceVariable {

	static int i = 5;
	int j = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNInstanceVariable b1 = new StaticNInstanceVariable();
		System.out.println(i);  //5
		System.out.println(b1.j);  //10
		i++;
		b1.j++;
		StaticNInstanceVariable b2 = new StaticNInstanceVariable();
		System.out.println(i);   //6
		System.out.println(b2.j); //10
		i++;
		b2.j++;
		StaticNInstanceVariable b3 = new StaticNInstanceVariable();
		System.out.println(i);  //7
		i++;
		b3.j++;
		System.out.println(i);   //8
		System.out.println(b1.j);  //11
		System.out.println(b2.j);  //11
		System.out.println(b3.j);  //11
	}

}
