import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Assignment_2 extends WriteTextFile {
	
	private static final String filePath = "E:\\java\\Assignment_2\\src\\main\\resources\\students.json";
	public static void main(String[] args) throws org.json.simple.parser.ParseException, ParserConfigurationException, TransformerException {
		Assignment_2 obj = new Assignment_2();
		try {
			
			// read the json file
			FileReader reader = new FileReader(filePath);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			// get an array from the JSON object
			JSONArray students= (JSONArray) jsonObject.get("students");
			Iterator studObj = students.iterator();
			Iterator studObj1 = students.iterator();
			WriteTextFile textObj = new WriteTextFile();
			textObj.writeTextFiles(studObj);
			textObj.writeXMLFiles(studObj1);
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}  catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}
