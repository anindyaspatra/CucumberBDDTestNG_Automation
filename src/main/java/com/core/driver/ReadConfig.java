package com.core.driver;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadConfig {

	private static final String CONFIG_PROPERTIES = "config.properties";

	public HashMap<String, String> readConfigFile() {
		HashMap<String, String> configProperties = new HashMap<String, String>();
		try {
			String folderPath = System.getProperty("user.dir");
			String filePath = folderPath + "/" + CONFIG_PROPERTIES;

			Properties prop = new Properties();
			FileReader reader = new FileReader(filePath);
			prop.load(reader);

			for (Object key : prop.keySet())
				configProperties.put((String) key, prop.getProperty((String) key));

		} catch (IOException e) {

		}
		return configProperties;
	}

}

