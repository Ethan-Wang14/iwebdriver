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

public class PromptForIphone {
	public static void main(String args[]) throws MalformedURLException{
		DesiredCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);
//		driver.get("http://localhost/prompt.html");
//		WebElement f = driver.findElement(By.name("myform"));
//		WebElement l = f.findElement(By.id("prompt"));
//		l.click();
		driver.get("http://testserver2.us.oracle.com/qamockups/Dialog_Manager/Internal_220/prompt.html");
		WebElement e = driver.findElement(By.tagName("input"));
        e.click();
		driver.quit();
	}
}
