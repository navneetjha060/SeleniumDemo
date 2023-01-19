package DemoSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Eclipse Workspace\\SeleniumDemo\\src\\test\\resources\\test.properties");
		prop.load(input);

		System.out.println(prop.getProperty("browser"));

		System.out.println(prop.getProperty("url"));

	}

}
