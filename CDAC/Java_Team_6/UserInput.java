import java.util.Scanner;
class Input{
	private int i;
	void setI(int i){
		this.i=i;
	}
	
	int getI(){
		return i;
	}
	
	public static void main(String[] args){
		Input i = new Input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		System.out.println(s);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		i.setI(a);
		System.out.println(i.getI());
		sc.close();
	}
}