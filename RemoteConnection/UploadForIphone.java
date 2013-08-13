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
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.uiautomation.ios.IOSCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;

public class UploadForIphone {
	public static void main(String args[]) throws MalformedURLException{
		IOSCapabilities safari = IOSCapabilities.iphone("safari");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.182.111.53:3001/wd/hub"),safari);
		driver.get("http://testserver2.us.oracle.com/qamockups/Forms/File_Upload-Download/Internal_344/uploadform.htm");
		WebElement file = driver.findElement(By.name("FILE1"));
		//file.sendKeys("/Users/weskerwzy/Library/Application Support/iPhone Simulator/6.1/Media/DCIM/100APPLE/IMG_0001.JPG");
		file.click();
		WebElement current = driver.switchTo().activeElement();
		System.out.println(current.toString());
	    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}
}

