package seleniumpacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\hahahah\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.findElement(By.linkText("Forgot Password")).click();
		driver.findElement(By.id("email")).sendKeys("");
		

	}

}
