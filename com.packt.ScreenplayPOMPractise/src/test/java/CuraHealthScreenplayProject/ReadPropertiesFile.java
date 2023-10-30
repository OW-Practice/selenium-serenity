package CuraHealthScreenplayProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class ReadPropertiesFile {
	

	public static Performable named(String propertiesFileName) {
        return Task.where("{0} reads properties from " + propertiesFileName,
                actor -> {
                    Properties properties = new Properties();

                    try {
                        // Load the properties file
                        FileInputStream file = new FileInputStream(propertiesFileName);
                        properties.load(file);
                        file.close();
                        
                        String username = properties.getProperty("username");
                        String password = properties.getProperty("password");
                        
                        Serenity.recordReportData().withTitle("Username").andContents(username);
                        Serenity.recordReportData().withTitle("Password").andContents(password);
                    }
                        catch (IOException e) {
                            throw new RuntimeException("Failed to read properties file", e);
                        }   
                });  
}
}