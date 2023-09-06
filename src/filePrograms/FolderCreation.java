package filePrograms;
import java.io.File;
import java.util.Scanner;
public class FolderCreation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the path where you want to create folder");
		String path = sc.next();
		System.out.println("Enter the name for folder");
		path = path + sc.next();
		
		File f1 = new File(path);
		boolean bool = f1.mkdirs();
		if(bool) {
			System.out.println("Folder is created successfully");
		}else {
			System.out.println("Error found");
		}
		sc.close();
	}

}
