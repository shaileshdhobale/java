import java.io.*;

public class FileException {

	public static void main(String args[]){
		FileReader fr = null;		
		try {
			File file = new File("file.txt");
			fr = new FileReader(file); char [] a = new char[50];
			fr.read(a);   // reads the content to the array
			System.out.println("Printing characters");
			for(char c : a)
				System.out.print(c);   // prints the characters one by one
		} catch(IOException e) {
			System.out.println("File not found....");
			e.printStackTrace();
		} catch(NullPointerException e){
			System.out.println("Null char exception....");
			e.printStackTrace();
		} finally {
			System.out.println("Witer cleanup code here \n");
		}
	}
}
