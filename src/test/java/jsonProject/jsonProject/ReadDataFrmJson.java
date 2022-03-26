package jsonProject.jsonProject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFrmJson {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jp = new JSONParser();

		// reading the data from the json file
		FileReader reader = new FileReader(".\\jsonFiles\\employee.json");

		Object obj = jp.parse(reader); // jp.parse will be reading into a object so object create cheyth kodukkanam

		// conversion of java object into json object

		JSONObject empjsonobj = (JSONObject) obj;
		String fname = (String) empjsonobj.get("firstName");
		System.out.println("first name  is " + fname);

		JSONArray array = (JSONArray) empjsonobj.get("address");
		// System.out.println("adress" + array);

		for (int i = 0; i < array.size(); i++) {

			JSONObject address = (JSONObject) array.get(i);
			String street = (String) address.get("street");
			System.out.println(street);

		}
	}

}
