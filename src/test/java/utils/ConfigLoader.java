package utils;

import java.util.Properties;

public class ConfigLoader {
	private final Properties properties;
	private static ConfigLoader configLoader;

	private ConfigLoader() {

		properties = PropertyUtils.propertyLoader("//resourses//config.properties");

	}

	public static ConfigLoader getInstance() {
		if (configLoader == null) {
			configLoader = new ConfigLoader();
		}
		return configLoader;
	}

	public String getBaseUrl() {
		String prop = properties.getProperty("baseUrl");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("property baseUrl is not specified in the config.properties file");
	}

	public String getUsername() {
		String prop = properties.getProperty("username");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("property username is not specified in the stg_config.properties file");
	}

	public String getPassword() {
		String prop = properties.getProperty("password");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("property password is not specified in the stg_config.properties file");
	}
}
