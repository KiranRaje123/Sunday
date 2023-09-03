package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void initialisation() {

		driver = new EdgeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S353090551%3A1688923979954095&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AeDOFXi6-yG85MNIwW8Pzc97fyvrav6vkZA5KMHTYNUt6ZmrOdtqDLZeMCwjQ6TU8YhmCTuliDSRfg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}
}
