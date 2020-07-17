import java.io.*;
class Laukik{
	public static void main(String[] args){
		try{
			/****Read a file*****/
			FileReader file = new FileReader("HelloWorld.txt");
			for(int i=0;i<11;i++)
				System.out.print((char)file.read());
			System.out.println();
			/***Write a file*****/
			FileWriter file1 = new FileWriter("Hello.txt");
			file1.write("Laukik");
			file1.close();
			System.out.println("done");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}