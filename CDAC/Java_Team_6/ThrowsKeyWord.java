import java.io.*;
class X{
	void fun1() throws FileNotFoundException,IOException{
		FileInputStream file = new FileInputStream("Hello.txt");
		file.close();
		System.out.println("fun1");
	}
	
	void fun2() throws IOException{
		fun1();
		System.out.println("fun2");
	}
	
	public static void main(String[] args){
		X x = new X();
		try{
			x.fun2();
		}catch(IOException e){
			System.out.println("exception handled");
		}
		System.out.println("main");
	}
}