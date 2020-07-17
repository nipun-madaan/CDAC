import java.io.*;
class Madhuri{
	public static void main(String[] args){
		try{
			/***Reading the file***/
			FileReader f = new FileReader("HelloWorld.txt");
			BufferedReader file = new BufferedReader(f);
			System.out.println(file.readLine());     //can use file.read(); for read byte by byte
			/***Writing the file***/
			FileWriter f1 = new FileWriter("D:\\Shruti.txt",true);
			BufferedWriter file1 = new BufferedWriter(f1);
			file1.write("Hello everyone!");
			file1.newLine();
			file1.write("My name is Shruti!");
			file1.close();
			System.out.println("done");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}