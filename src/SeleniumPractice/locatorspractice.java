package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorspractice {
	
	//basic level locators:-facebook
	//1.id2.name
	//3.linked text
	//4.partial link text
	//5.classname
	//tagname
	
	public static void main(String[]args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		
		//1.id
		//driver.findElements(By.id("id value from the website"));
		driver.findElements(By.id("email")); //username
		driver.findElements(By.id("pass"));  //password
		
		//2.name
		driver.findElements(By.name("the value for the name attribute"));
		driver.findElements(By.name("email"));
		driver.findElements(By.name("pass"));
		
		//3.linked text (links==>a)
		driver.findElements(By.linkText("full link text data"));
		driver.findElements(By.linkText("Forgotten Password?"));
		
		//4.partial link text (links/images==a/img)
		driver.findElements(By.partialLinkText("password?"));  //link with full text that should be unique
		
		//5.classname
		//driver.findElements(By.classname("the value for the attribute class from the website"));
		//driver.findElements(By.classname("inputtext_55r1_6luy"));  //emailid
		driver.findElements(By.className("input_55r1_6luy_9npi"));  //password
		
		//6.tagname(when find out multiple elements with a common tag or the unique element available on webpage)
		driver.findElements(By.tagName("tag name from the website"));
		driver.findElements(By.tagName("a"));  //for multiple elements driver.fijndelements
		
	
		//Xpaths
		//1.Absolute
		//2.Relative xpath
		
		//driver.findElements(By.xpath("pass the x path captured from website"));
		driver.findElements(By.xpath("/html/body/div[3]/a[2]"));  //absloute
		driver.findElements(By.xpath("//div[3]//a[2]"));  //relative
		
		
	}
	
}
