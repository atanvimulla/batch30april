package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementpractice {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		//1.sendkeys():- text field==>data pass
		
	// WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
	// Username.sendkeys("30Aprilfacebookaccount");
	//
	// driver.findElements(By.xpath("input[@id='pass']")).sendKeys("@123$321");
		
		//2.click():- buttons/radiobutton/checkbox/link
		
	// WebElementLoginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
	// LoginBtn.click();
		
    // WebElementSignUpLink=driver.findElement(By.xpath("//a[text()='Sign Up']"));
	// LoginBtn.click();
		
	// SignupLink.click();
		
    // 3.isEnabled:- state of the element
    // WebElement Username=driver.findElements(By.xpath("//input[@id='name']"));
	// System.out.println(Username.isEnabled());
	// 
	//if(Username.isEnabled()=true){
    //
    // System.out.println("User name field is enabled");
	//}else{
	//System.out.println("User name field is disabled");
	}
    // 3.isDisplayed()==true){
	// 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
