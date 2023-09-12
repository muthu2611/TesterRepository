package org.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.ReusablityMethods;

public class ProductCardPage extends ReusablityMethods{
	WebDriver driver;
	 String myproductName="Lando Gym Jacket";
	   
		
		public ProductCardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	
		
		@FindBy(xpath="//a[@class=\"action viewcart\"]")
		WebElement viewcard;
		
		@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
		WebElement pagecheckout;
		
		
		
		public void pageordercheckout() throws InterruptedException{
			Thread.sleep(1000);
			scrollpage(viewcard, driver);
			viewcard.click();
			Thread.sleep(9000);
			scrollpage(pagecheckout, driver);
			pagecheckout.click();
		}
		

}
