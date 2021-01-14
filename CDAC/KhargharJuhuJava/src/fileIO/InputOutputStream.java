package fileIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputStream {

	public static void main(String[] args) {
		InputStreamReader in = new  InputStreamReader(System.in);
		try {
			char c;
			do {
				c = (char)in.read();
				System.out.println(c);
			}while(c!='q');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
