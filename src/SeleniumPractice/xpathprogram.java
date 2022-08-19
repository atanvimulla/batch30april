package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathprogram {
	
	public static void miain(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
				WebDriver driver=new ChromeDriver();
		
		//Basic Locators
		
		//1.ID
		driver.findElement(By.id("provide the id value from the website"));
		driver.findElement(By.id("email"));
		
		//2.NAME
		driver.findElement(By.name("provide the name value from the website"));
		driver.findElement(By.name("name"));
		
		//3.linked text
		driver.findElement(By.linkText("provide the text from the website which written in><symbol"));
		driver.findElement(By.linkText("Forgotten password?"));
		
		//4.Partial Link Text
		driver.findElement(By.partialLinkText("provide the part of text from the website which written in symbol><symbol"));
		driver.findElement(By.partialLinkText("password?"));
		
		//5.Classname
		driver.findElement(By.className("provide the attribute value for the class attribute from website"));
		driver.findElement(By.className("inputtext_55r1_6luy"));
		
		//6.Tagname
		driver.findElement(By.tagName("provide the tagname from the website"));
		driver.findElement(By.tagName("button"));
		
		//Customized Locators
		
		//7.Absolute xpath
		driver.findElement(By.xpath("provide the absolute x path from the website"));
		driver.findElement(By.xpath("/html/body/div[1]/div[1],div[1]/div/div/div/div[1]/h2"));
		
		//8.Relative xpath 
		driver.findElement(By.xpath("provide the relative x path from the website"));
		driver.findElement(By.xpath("//[@id='content']//h2"));
		
		Customized xpath
		
		//9.xpath with regular expression
		driver.findElement(By.xpath("//tagname[@attribute='attribute value']"));
		driver.findElement(By.xpath("//input[@id='email']"));
		
		//10.xpath by text()
		driver.findElement(By.xpath("//tagname[@text()='value']"));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//11.xpath by contains
		driver.findElement(By.xpath("//tagname[contains(@attribute='value']"));
		driver.findElement(By.xpath("//input[contains(@id,u_b')]"));
		
		//12.xpath by starts-with
		driver.findElement(By.xpath("//tagname[starts-with(@attribute='value']"));
		driver.findElement(By.xpath("//input[starts-with(@id,'u_O_b')]"));
		
		//13.xpath by logical operator ==> and
		driver.findElement(By.xpath("//tagname[@attribute1='value1' and @attribute2='value2]"));
		driver.findElement(By.xpath("//input[@type='text'and @name='firstname']"));
		
		//14.xpath by logical operator or
		driver.findElement(By.xpath("//tagname[@attribute1='value1' or @attribute2='value2']"));
		driver.findElement(By.xpath("//input[@'u_O_b_eA' or @name='firstname']"));
		
		//Locators by CSS selectors
		
		//15.CSS==> tag and id ==>tag#id
		driver.findElement(By.cssSelector("tag#id"));
		driver.findElement(By.cssSelector("input#email"));
		
		//16.CSS==> tag and class ==> tag.class
		driver.findElement(By.cssSelector("tag.class"));
		driver.findElement(By.cssSelector("input#email"));
		
		//17.CSS==> tag and attribute==>tagname[attribute=value]
		driver.findElement(By.cssSelector("tagname[attribute='value]"));
		driver.findElement(By.cssSelector("input[tagname[name='email']"));
		
		//18.CSS==>tag,class and attribute==>tagname.classname[attribute=value]
		driver.findElement(By.cssSelector("tagname.classname[attribute='value']"));
		driver.findElement(By.cssSelector("input.inputtext[name='email']"));
			
	}

}
