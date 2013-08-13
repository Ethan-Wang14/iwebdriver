package RemoteConnection;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;

public class DialogForIphone {
	public static void main(String args[]) throws MalformedURLException{
		IOSCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);
		driver.get("http://testserver2.us.oracle.com/qamockups/Dialog_Manager/Internal_214/okcancel.html");
		WebElement e = driver.findElement(By.tagName("input"));
		e.click();
	}
}
