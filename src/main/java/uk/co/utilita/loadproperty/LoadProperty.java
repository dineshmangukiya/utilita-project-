package uk.co.utilita.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    /**
     * Project path to get property of user directory
     */
    String projectPath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        /**
         * Use try and catch blocks to handle IOException and used config.properties path
         */

        try {
            input = new FileInputStream(projectPath + "/src/test/java/uk/co/utilita/resources/propertiesfile/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }


}
