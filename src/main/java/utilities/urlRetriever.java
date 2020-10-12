package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class urlRetriever 
{
	public static String getSmatBotHome_url() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\urlResourceConfig.properties");
		prop.load(fis);
		String homeURL = prop.getProperty("smatBotHome");
		return homeURL;
	}
}
