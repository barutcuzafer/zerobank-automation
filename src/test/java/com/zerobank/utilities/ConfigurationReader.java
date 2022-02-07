package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {


        try {
            String path="configuration.properties";

            FileInputStream fileInputStream=new FileInputStream(path);

            properties=new Properties();

            properties.load(fileInputStream);

            fileInputStream.close();




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }


    }


