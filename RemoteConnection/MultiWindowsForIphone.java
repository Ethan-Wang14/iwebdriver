package RemoteConnection;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;

public class MultiWindowsForIphone 
{
	public static void main(String args[]) throws MalformedURLException
	{
		IOSCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);	
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
