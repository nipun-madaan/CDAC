import java.io.*;
class Manoj{
	public static void main(String[] args){
 		 try{
			FileReader file = new FileReader("HelloWorld.txt");
			/*for(int i=0;i<=11;i++)
				System.out.println(file.read());*/    //11th byte is -1
			int b;
			while((b = file.read()) != -1){
				System.out.print((char)b);
			}
			System.out.println();
			System.out.println("Done");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}