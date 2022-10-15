package utilities;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import pojo.DataFetch;

public class DataReadYaml  {
	
	public static void main(String[] args) {
	
		ObjectMapper mapper= new ObjectMapper(new YAMLFactory());
		
		try {
    		File file= new File(("user.dir")+("\\src\\test\\resources\\data\\data.yaml"));
			DataFetch df= mapper.readValue(file, DataFetch.class);
			System.out.println(df.getUserName());	
		}
		catch(Exception e) {	
		}
	}
}

