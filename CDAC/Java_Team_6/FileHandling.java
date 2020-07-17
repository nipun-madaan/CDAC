import java.io.*;
class ANM{
	public static void main(String[] args){
		try{
			/****Read a file****/
			FileInputStream file = new FileInputStream("HelloWorld.txt");
			for(int i=0;i<11;i++)
				System.out.print((char)file.read());
			System.out.println();
			file.close();
			/****Write in a file****/
			String s = "Hello World";
			FileOutputStream file1 = new FileOutputStream("Hello.txt");
			byte[] data = s.getBytes();
			file1.write(data);
			file1.close();
			System.out.println("done");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}