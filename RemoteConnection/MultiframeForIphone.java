package RemoteConnection;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;

public class MultiframeForIphone {
	public static void main(String args[]) throws MalformedURLException{
		IOSCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);
		driver.get("http://localhost/multiframes");
		driver.switchTo().frame(0);
        WebElement s1 = driver.findElement(By.id("kw"));
        s1.sendKeys("hello");

        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);//driver.findElement(By.id("m2")));
        WebElement s2 = driver.findElement(By.id("kw"));
        s2.sendKeys("world");
		driver.quit();
	}
}
