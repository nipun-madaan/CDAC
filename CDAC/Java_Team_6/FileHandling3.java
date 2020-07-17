import java.io.*;
class Shruti{
	public static void main(String[] args){
		try{
			File f = new File("HelloWorld.txt");
			FileReader file = new FileReader(f);
			for(int i=0;i<f.length();i++)
				System.out.print((char)file.read());
			System.out.println();
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}