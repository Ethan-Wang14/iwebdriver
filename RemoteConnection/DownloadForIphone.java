package RemoteConnection;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;

public class DownloadForIphone {
	public static void main(String args[]) throws MalformedURLException{
		DesiredCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);
		driver.get("http://testserver2.us.oracle.com/fmstocks/");
		WebElement login = driver.findElement(By.name("LoginButton"));login.click();
		WebElement t = driver.findElement(By.id("menu"));
	    List<WebElement> links = t.findElements(By.tagName("a"));
	    WebElement link = links.get(1);
	    link.click();
		links.clear();
		links = driver.findElements(By.tagName("a"));
		link = links.get(links.size()-2);
		link.click();
		driver.quit();
	}
}
