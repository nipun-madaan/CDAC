package fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("output1.txt");
			/*for(int i=0;i<15;i++) {
				System.out.print((char)reader.read());
			}*/
			/**Alternate**/
			int i;
			while((i=reader.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
			reader.close();
			String s = "Pranit";
			FileWriter writer = new FileWriter("output.txt");
			writer.write(s);
			writer.close();   //it is mandatory to close for FileWriter
			System.out.println("You have written into the file successfuly");
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
