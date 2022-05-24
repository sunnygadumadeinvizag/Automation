package com.commonlib;

import static io.restassured.RestAssured.baseURI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	protected final String userID = "f5da416b-9735-4d1c-a891-9fa5dff85947";
	protected final String userName = "sanyasi";
	protected final String password = "Sanyasis@123";
	protected final String baseUrl = "https://bookstore.toolsqa.com";

	public static Logger logs = Logger.getLogger(TestBase.class);

	@BeforeSuite
	public void beforeSuite() {
		baseURI = baseUrl;

		logs.info("Excecution Started Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		logs.info("After suite");
	}

}
