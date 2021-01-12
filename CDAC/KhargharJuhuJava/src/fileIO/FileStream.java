package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("output.txt");
			String s = "Prafull Gaikwad";
			byte[] data = s.getBytes();
			out.write(data);  //used to write into file and it accepts byte array
			out.close();
			System.out.println("You have written into the file successfuly");
			FileInputStream in = new FileInputStream("output.txt");
			for(int i=0;i<15;i++)
				System.out.print((char)in.read());
			System.out.println();
		//	in.
			FileOutputStream out1 = new FileOutputStream("output1.txt");
			int i;
			while((i =in.read()) !=-1)
				out1.write(i);
			in.close();
			out1.close();
			System.out.println("You have written into the file successfuly");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
