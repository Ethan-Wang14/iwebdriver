package RemoteConnection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowsForFirefox 
{
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		List<String> knownHandles = new ArrayList<String>();
		knownHandles.add(driver.getWindowHandle());
		((JavascriptExecutor)driver).executeScript("window.open();");
		// find the new handle. we are getting a set 
		for (String handle : driver.getWindowHandles()) {
		    if (!knownHandles.contains(handle)) {
		        knownHandles.add(handle);
		        break;
		    }
		}
		String firstHandle = knownHandles.get(0);
		String newHandle = knownHandles.get(knownHandles.size() -1 );
		driver.switchTo().window(newHandle);
		driver.get("http://www.baidu.com");
		driver.switchTo().window(firstHandle);
		driver.get("http://www.renren.com");
	}
}
