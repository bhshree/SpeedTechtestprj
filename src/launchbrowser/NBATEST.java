package launchbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NBATEST 
{
	public static WebDriver driver;
	public static final  String path="./config.properties";
	
	public static int getData(String Key) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		return 0;
		
	}
	public static void bowserlaunch(String browser,String url)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://192.168.0.100:8081/NBA/");
		
		System.setProperty("webdriver.driver.geckodriver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://192.168.0.100:8081/NBA/");
		
		driver.manage().deleteAllCookies();
		driver.navigate().forward();
		
	}
}
