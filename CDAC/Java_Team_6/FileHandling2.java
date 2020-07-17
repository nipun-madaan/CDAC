import java.io.*;
class Meghana{
	public static void main(String[] args){
		try{
			File f = new File("Meghana.txt");
			//f.createNewFile();   //create new file
			System.out.println(f.exists());   //check whether file exists or not
			System.out.println(f.length());   //no of charcters in the file
			//f.delete();                    //delete the file
			System.out.println("done");
		}catch(Exception e){
			System.out.println("Exception occured");
		}
	}
}