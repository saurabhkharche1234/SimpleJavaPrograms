package ExceptionsBasic;
import java.io.*;

class ListOfNumbers{
	//create an integer array
	private int[] list = {5,6,7,8,9,2};
	
	//method to write data from array to file
	public void writeList()
	{
		PrintWriter out = null;
		
		try {
			System.out.println("Entering try statement");
			
			//creating a new file Outputfile.txt
			out = new PrintWriter(new FileWriter("OutputFile.txt"));
			
			//writing values from list array to OutputFile.txt
			
			for(int i=0;i<7;i++)
			{
				out.println("value at:"+i+" = "+list[i]);
			}
		}
		
		catch(Exception e) {
			System.out.println("Exception::"+e.getMessage());
		}
		finally {
			//checking if parameter has been opened
			if(out!=null)
			{
				System.out.println("Closing PrintWriter");
				//close PrintWriter
				out.close();
			}
			else 
			{
				System.out.println("PrintWriter not open");
			}
		}
	}
}
public class Try_Catch_Finally {

	public static void main(String[] args) {
	
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();
	}

}
