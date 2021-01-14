package fileIO;

import java.io.File;

public class FileOperations {

	public static void main(String[] args) {
		String directory = "E:\\githubRespositories\\CDAC\\CDAC\\KhargharJuhuJava";
		File f = new File(directory);
		//boolean created = f.mkdir();  //it is used to create a directory
		/*if(created) {
			System.out.println("created");
		}else {
			System.out.println("not created");
		}*/
		String [] paths = f.list();  //it returns all the sub folders and files
		for(String path : paths) {
			System.out.println(path);
		}
	}
}
