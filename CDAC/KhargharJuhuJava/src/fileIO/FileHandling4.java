package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling4 {

	public static void main(String[] args) {
		FileReader read = null;
		try {
			read = new FileReader("output.txt");
			BufferedReader bufferReader = new BufferedReader(read);
			String s = bufferReader.readLine();
			FileWriter writer = new FileWriter("input.txt");
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			bufferWriter.write("My name is Prafull Gaikwad");
			bufferWriter.newLine();
			bufferWriter.write("I am topper of edac sept 2020");
			bufferWriter.append(" batch");
			bufferWriter.newLine();
			bufferWriter.append(s);
			bufferWriter.append(" is also the topper of edac sept 2020");
			bufferWriter.close();
			bufferReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
}
