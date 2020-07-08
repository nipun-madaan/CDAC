import java.io.*;
class G1{
	public static void main(String[] args){
		FileInputStream file = null;
		try{
			file = new FileInputStream("HelloWorld.txt");
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("exception handled");
		}finally{
			try{
				file.close();
				System.out.println("file closed");
			}catch(IOException e){
				System.out.println("IO Exception");
			}
		}
		System.out.println("main");
	}
}