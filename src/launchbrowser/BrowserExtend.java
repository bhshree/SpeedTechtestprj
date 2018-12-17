package launchbrowser;

import org.openqa.selenium.By;

public class BrowserExtend extends Basepage
{
	public static void main(String args[]) throws Exception
	{
		browserlaunch(getData("browser"),getData("hdfc"));
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(200);
		driver.quit();
	}
	
	}
