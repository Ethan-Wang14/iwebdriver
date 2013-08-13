package RemoteConnection;

import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiframeForFirefox {
	public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        //driver.get("http://localhost/multiframe");
        driver.get("http://localhost/multiframes");   
		driver.switchTo().frame(0);
        WebElement s1 = driver.findElement(By.id("kw"));
        s1.sendKeys("hello");
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame(1);//driver.findElement(By.id("m2")));
        WebElement s2 = driver.findElement(By.id("kw"));
        s2.sendKeys("world");
        //driver.switchTo().window("new");
		//driver.quit();
	}
}
