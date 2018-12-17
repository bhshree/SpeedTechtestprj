package launchbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage 
{
	public static WebDriver driver;
	public static final String path="./config.properties";
	
	public static String getData(String key)throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public static void browserlaunch(String browser,String url)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.geko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		    driver =new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();		
			
		}
		//driver.get("http://www.google.com");
		driver.navigate().to("url");
		//driver.manage().window().maximize();
	
	}
}
