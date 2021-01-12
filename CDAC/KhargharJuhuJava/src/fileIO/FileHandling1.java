package fileIO;

import java.io.File;

public class FileHandling1 {

	public static void main(String[] args) {
		File f = new File("output.txt");
		try {
			//f.createNewFile();  //used to create new file
			System.out.println("File exits : "+f.exists());  //file exists or not
			System.out.println(f.length());   //no of char in the files
			//f.delete();  //deletes the file
			//System.out.println("File created");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
