package utils;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtilis {

	public static <T> T deserializeJson(String filePath, Class<T> T) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		InputStream is = JacksonUtilis.class.getClassLoader().getResourceAsStream(filePath);
		return objectMapper.readValue(is, T);

	}
}
