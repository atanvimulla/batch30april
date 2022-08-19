package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentfb {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//	Assignment :-  facebook home page  ==> signup  link ==> 
	//	               correct page navigate verify ==> signup page automate
		
		WebElement signupLink = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		
		signupLink.click();
		
		String urlAct = driver.getCurrentUrl();
		
		String urlExpected = "https://www.facebook.com/reg/";
		
		if(urlAct.equals(urlExpected)) {
			
			System.out.println("verified and correct result");
			
		}else {
			
			System.out.println("not equals to expected results");
		}
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		FirstName.sendKeys("Tanvi");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		LastName.sendKeys("Mulla");
		
        WebElement Mobileno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		Mobileno.sendKeys("112233445566");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			
		Password.sendKeys("Zeke15@");
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value='1']"));
		
		Gender.click();
		
        WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and  @name='websubmit']"));
		
		signup.click();
	
}
	
}
