package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop = new Properties();
    static FileInputStream input;
    static String PropertiesFileLocation = "src/test/java/TestData/TestConfig.properties";


    public String getProperty(String key){
        try {
            input = new FileInputStream(PropertiesFileLocation);
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
    public void verifyMyLoadProp()
    {
        System.out.println(getProperty("url"));
    }
}
