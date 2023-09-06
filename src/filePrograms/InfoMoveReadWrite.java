//program to get file info, rename and move file, read to file and write to file
package filePrograms;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
public class InfoMoveReadWrite {
	//function to get file info
	public static void fileInfo(File f1) {
		if(f1.exists()) {
			System.out.println("File Name: "+f1.getName());
			System.out.println("Path: "+f1.getAbsolutePath());
			System.out.println("length: "+f1.length());
			System.out.println(" is writeable:"+f1.canWrite());
			System.out.println("is readable: "+f1.canRead());
			System.out.println("is Executable: "+f1.canExecute());
		}else {
			System.out.println("File does not exists");
		}
	}
	
	//function to rename and move file from one folder to another
	public static void renameMove() {
		File f2 = new File("S:\\Demo.txt");
		//renaming and moving file to other location
		if(f2.renameTo
		           (new File("S:\\New folder\\demo.txt"))) {
			f2.delete();  								//now deleting the original file
			System.out.println("File moved successfully");
			
		}else {
			System.out.println("Failed to remove the file");
		}
	}
	
	//move folder 
	 //to test this function you need to create file in E drive as this program is already executed
	public static void folderMove() {
		try {
			Files.move(Paths.get("S:\\Study\\filesprog"),  
			           Paths.get("S:\\Study\\filesprog"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	//to write and read to file 
	
	public static void readWrite() {
		try {
			//to write to file
			FileWriter demoWriter = new FileWriter("S:\\Study\\filesprog\\demo.txt");
			Scanner sc = new Scanner(System.in);
			String words = sc.nextLine();
			demoWriter.write(words);
			demoWriter.close();
			System.out.println("Content Written successfully");
			
			
			//to read the content present in file
			File f2 = new File("S:\\\\Study\\\\filesprog\\\\demo.txt");
			System.out.println("The data present in the file is:");
			Scanner demoReader  = new Scanner(f2);
				while(demoReader.hasNextLine()) {
					String fileData = demoReader.nextLine();
					System.out.println(fileData);
				}
			sc.close();
			demoReader.close();
			
		} catch (IOException e) {
					e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		File f1 = new File("S:\\text.txt");
		
		fileInfo(f1);
		renameMove();
		folderMove();
		readWrite();
}
}