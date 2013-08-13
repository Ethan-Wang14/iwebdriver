package RemoteConnection;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlertDialogChrome {
	public static void main(String args[])throws Exception{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
		//WebDriver driver = new ChromeWebDriver(capabilities);
	}
}
