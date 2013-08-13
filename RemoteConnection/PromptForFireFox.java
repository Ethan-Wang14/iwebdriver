package RemoteConnection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptForFireFox {
	public static void main(String[] args) throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://testserver2.us.oracle.com/qamockups/Dialog_Manager/Internal_220/prompt.html");    
        WebElement e = driver.findElement(By.tagName("input"));
        e.click();
        Alert prompt = driver.switchTo().alert();
        System.out.println(prompt.getText());
        prompt.sendKeys("Wesker");
        prompt.accept();
        prompt = driver.switchTo().alert();
        prompt.accept();
        //driver.quit();
	}
}

