package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;



import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;

public class Utlis {

private RequestSpecification req;
	
	public  RequestSpecification requestSpecification() throws IOException{
		
		
		if(req==null){
			PrintStream log=new PrintStream(new FileOutputStream("logging.txt"));
     req	=new RequestSpecBuilder().setBaseUri(globalVariables("baseURI")).
    		 addFilter(RequestLoggingFilter.logRequestTo(log)).
    		 addFilter(ResponseLoggingFilter.logResponseTo(log)).
		setContentType(ContentType.JSON).build();
		return req;
		}
		return req;
		
	}
	
	
	public static String globalVariables(String key) throws IOException{
		
		Properties prop =new Properties();
		FileInputStream fis=new FileInputStream(getFilePath()+"//src//test//java//resources//global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	
	 public static String getFilePath() {
		    String filepath;
		    File file = new File("");
		    String absolutePathOfFirstFile = file.getAbsolutePath();
		    filepath = absolutePathOfFirstFile.replaceAll("\\\\+", "/");

		    return filepath;
		  }
	 
	 public  String  getReponse(Response res, String key){
		 
		 String res1=res.asString();
	    	JsonPath js=new JsonPath(res1);
			return js.getString(key).toString();
		 
	 }



		 

	 
}
