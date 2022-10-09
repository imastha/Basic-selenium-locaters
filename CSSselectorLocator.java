package seleniumpacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\\\hahahah\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a.theme-btn")).click();
		driver.findElement(By.cssSelector("input.user_name")).sendKeys("Astha Rana");
		driver.findElement(By.cssSelector("input.user_email")).sendKeys("ranaastha146@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("label.form-footer ash m-l-2-xs bodyMain")).click();
		driver.findElement(By.cssSelector("input#signup-button")).click();
		
		

	}

}
