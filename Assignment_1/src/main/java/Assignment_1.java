import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Assignment_1 {
private static final String filePath = "E:\\java\\Assignment_1\\src\\main\\resources\\students.json";
	

	public void writeTextFile(Iterator studObj) throws IOException {
		File file = new File("E:\\java\\Assignment_1\\src\\main\\resources\\destination.txt");
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
	
	public void writeXMLFile(Iterator studObj) throws ParserConfigurationException, TransformerException{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("students");
		doc.appendChild(rootElement);
		
		while (studObj.hasNext()) {
			JSONObject innerObj = (JSONObject) studObj.next();
			// staff elements
			Element student = doc.createElement("student");
			rootElement.appendChild(student);
	
			// set attribute to student element
			Attr attr = doc.createAttribute("id");
			Long id = (Long) innerObj.get("id");
			attr.setValue(Long.toString(id));
			student.setAttributeNode(attr);
	
			// name elements
			Element name = doc.createElement("name");
			name.appendChild(doc.createTextNode((String) innerObj.get("fName") + " " + (String) innerObj.get("lName") ));
			student.appendChild(name);
	
			// score elements
			Element score = doc.createElement("score");
			score.appendChild(doc.createTextNode(Long.toString(id)));
			student.appendChild(score);
	
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("E:\\java\\Assignment_1\\src\\main\\resources\\destination.xml"));
	
			// Output to console for testing
	
			transformer.transform(source, result);
		}
		System.out.println("XML File saved!");
	}
	
	public static void main(String[] args) throws org.json.simple.parser.ParseException, ParserConfigurationException, TransformerException {
		Assignment_1 obj = new Assignment_1();
		try {
			
			// read the json file
			FileReader reader = new FileReader(filePath);
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			// get an array from the JSON object
			JSONArray students= (JSONArray) jsonObject.get("students");
			Iterator studObj = students.iterator();
			Iterator studObj1 = students.iterator();
			obj.writeTextFile(studObj);
		    obj.writeXMLFile(studObj1);
			
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
