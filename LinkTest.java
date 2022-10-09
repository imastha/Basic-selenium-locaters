package seleniumpacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\hahahah\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a.theme-btn.register-btn")).click();
		driver.findElement(By.id("email")).sendKeys("ranaastha146@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("remember_me")).click();
		driver.findElement(By.cssSelector("input.btn-primary.button.p-v-2-xs.p-h-5-xs.m-v-3-xs.col-12-xs")).click();
}

}
