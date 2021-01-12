package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) {
		File f = new File("output1.txt");
		try {
			FileReader reader = new FileReader(f);
			for(int i=0;i<f.length();i++) {
				System.out.print((char)reader.read());
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
