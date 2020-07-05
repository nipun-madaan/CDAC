import java.io.*;
class L2{
	public static void main(String[] args){
		try{
			FileInputStream file = new FileInputStream("Hello.text");
			file.close();
		}catch(FileNotFoundException e){
			System.out.println("FIle Exception Handled");
		}catch(IOException e){
			System.out.println("IO excepttion Handled");
		}
	}
}