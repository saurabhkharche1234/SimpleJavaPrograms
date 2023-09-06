

package filePrograms;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
	File obj = new File("S:\\New folder\\text.txt");
	try {
		if(obj.createNewFile()) {
			System.out.println("File name "+obj.getName()+" is created successfully");
		}else {
			System.out.println("File already exists");
			
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
