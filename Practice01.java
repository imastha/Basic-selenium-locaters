package seleniumpacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Registration page
		System.setProperty("webdriver.chrome.driver", "G:\\\\hahahah\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.cssSelector("a.theme-btn")).click();
		driver.findElement(By.id("user_name")).sendKeys("Astha Rana");
		driver.findElement(By.id("user_email")).sendKeys("ranaastha146@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector("input.m-l-0-xs")).click();
		driver.findElement(By.cssSelector("input.button.btn-primary.col-10-xs.p-v-2-xs.p-h-5-xs.m-v-3-xs")).click();
		
		

	}

}
