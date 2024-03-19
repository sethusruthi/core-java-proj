package org.Collections.Properties;

import lombok.Value;

import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
    public static void main(String[]args){

        Properties p = new Properties();
        p.setProperty("Greeting","Good Morining");
        try {
            //we are loading the properties file created in resources.
            p.load(ReadingPropertiesFile.class.getResourceAsStream("/db.properties"));
            //how we get it from the property files

            System.out.println(p.getProperty("db.url"));
            System.out.println(p.getProperty("Greeting"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
