package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {

	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("output1.txt");
			BufferedReader bufferReader = new BufferedReader(read);
			System.out.println(bufferReader.readLine()); //we can use read() if want byte by byte
			bufferReader.close();
			
			FileWriter writer = new FileWriter("input.txt");
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			bufferWriter.write("My name is Prafull Gaikwad");
			bufferWriter.newLine();
			bufferWriter.write("I am topper of edac sept 2020");
			bufferWriter.append(" batch");
			bufferWriter.close();  //it is compulsory to close to write into the file
			System.out.println("File written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
