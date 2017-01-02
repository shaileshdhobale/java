import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONObject;

public class WriteTextFile extends WriteXMLFile{
	
	public void writeTextFiles(Iterator studObj) throws IOException {
		File file = new File("E:\\java\\Assignment_2\\src\\main\\resources\\destination.txt");
		// creates the file
		file.createNewFile();
		// creates a FileWriter Object
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write("Id | First Name | Last Name | Score \n"); 
		while (studObj.hasNext()) {
			JSONObject innerObj = (JSONObject) studObj.next();
			writer.write(innerObj.get("id") + "|" + innerObj.get("fName") + "|" + innerObj.get("lName") + "|" + innerObj.get("score") + "\n");
//			System.out.println("Id:  "+ innerObj.get("id") + " First Name:  " + innerObj.get("fName") + " Last Name: " + innerObj.get("lName") + "Score : " + innerObj.get("score"));
		}
		writer.flush();
	    writer.close();
	    System.out.println("Text File saved!");
	}
}