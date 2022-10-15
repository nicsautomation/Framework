package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenClass {
	String ConfigFilePath = System.getProperty("user.dir")+("\\src\\test\\resources\\data\\config.properties");
	Properties propObj; 
	
	
	public DataDrivenClass() {
		propObj = new Properties();
		FileReader FRobj;
		try {
			FRobj = new FileReader(ConfigFilePath);
			propObj.load(FRobj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getURL() {
		String url = propObj.getProperty("LoginURL");
		return url;
	}
	public String getUsername() {
	String username = propObj.getProperty("username");
	return username;
	}
	public String getPassword() {
		String password = propObj.getProperty("password");
		return password;	
	}
	public String getHomeURL() {
		String homeURL = propObj.getProperty("HomeURL");
		return homeURL;
	}
	public String getCityURL() {
		String cityURL=propObj.getProperty("cityURL");
		return cityURL ;
		}
	public String getEbayURL() {
		String ebayURL=propObj.getProperty("ebayURL");
		return ebayURL;	
	}
	public String getGuruURL() {
		String guruURL=propObj.getProperty("guruURL");
		return guruURL;
	}
	public String getRogersURL() {
		String rogersURL=propObj.getProperty("rogersURL");
		return rogersURL;
	}
}
