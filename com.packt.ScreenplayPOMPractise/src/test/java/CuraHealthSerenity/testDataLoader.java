package CuraHealthSerenity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testDataLoader {
	private Properties testDataProperties;

	public testDataLoader() {
		testDataProperties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("testData.properties");
			testDataProperties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUsername() {
		return testDataProperties.getProperty("username");
	}

	public String getPassword() {
		return testDataProperties.getProperty("password");
	}

//	public String getSiteURL() {
//		return testDataProperties.getProperty("SiteURL");
//	}
}
