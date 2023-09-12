package org.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginapp {
	
    WebDriver driver;
   
	
	public loginapp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]")
	WebElement signinuser;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement userpass;
	
	@FindBy(xpath="//button[@class=\"action login primary\"]//span")
	WebElement login;
	
	
	public void signinapp() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signinuser.click();
	}
	
	public void entercred(String email , String password) {
			
		username.sendKeys(email);
		userpass.sendKeys(password);
		login.click();
	}

}
