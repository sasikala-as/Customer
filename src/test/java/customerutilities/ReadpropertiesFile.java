package customerutilities;



import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadpropertiesFile {

public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\hp\\Documents\\QDMS_ECLIPSE\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
	
		Properties p = new Properties();
		p.load(fr);
	
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}
