package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customizedlocators {
	
public static void main(String[]args)throws InterruptedException{
	
	System.setProperty("webdriver.chromedriver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com/");
	
	Thread.sleep(2000);
	
	//customized xpath
	//1.basicxpath
	//2.text()
	//3.contains()
	//4.starts-with
	//5.logical operators
	
	//1.basic xpath
	//tagname[@attribute='value'];
	driver.findElement(By.xpath("//input[@data-testid='royal_pass]"));//password
	driver.findElement(By.xpath("//input[@id='email']"));   //username
	
	//2.text():-this will allow you to locate the element based on inner text.
	//tagname[text()='value']
	driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
	//3.contains()
	//tagname[contains(@attribute,'value')]==> the value should not be full.shot form/part of attribute value.
	driver.findElement(By.xpath("//input[contains(@aria-label,'Email address')]"));
	//username
	driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
	//password
	
	//4.starts-with()==> if your attribute value is too long then you can take starting string.(first part)
	//tagname[starts-name(@attribute,'value')];
	driver.findElement(By.xpath("//img[starts-with(@src,'https://static.xx.')]"));
	
	//5.logical operators ==>1. and 2.or
	//1.and=> if both are true
	//if both the attributes for the element are present then you can use and operator 
	//tagname[@attribute1='value1' and @attribute2='value2']
	driver.findElement(By.xpath("//input[@id='email' and @name='value']"));
	
	//2.or==> any one is true
	//if atleast one attribute out of two is present
	//tagname[@attribute1='value' or attribute2='value2']
	driver.findElement(By.xpath("//input[@id='email' or @name='email1']"));
	
	//Element location by CSS Selectors
	
	//1.tag and id
	//css=>tag#id
	driver.findElement(By.cssSelector("input#email")).sendKeys("abcdef");
	driver.findElement(By.cssSelector("input#pass")).sendKeys("abcdef");
	
	//2.tag and class
	//css=>tag.class
	driver.findElement(By.cssSelector("div._6ltg")).click();
	
	//3.tag and attribute 
	//css=>tagname[attribute=value]
	driver.findElement(By.cssSelector("input[name='pass']"));
	
	//4.tag and class attribute
	//css==>tag.class[attribute='value']
	driver.findElement(By.cssSelector("img.fb_logo[alt='Facebook']"));	
}
}
