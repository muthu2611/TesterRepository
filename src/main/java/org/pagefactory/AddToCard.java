package org.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.ReusablityMethods;

public class AddToCard extends ReusablityMethods {
	WebDriver driver;
	 String myproductName="Lando Gym Jacket";
	   
		
		public AddToCard(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	
		@FindBy(id="option-label-size-143-item-167")
		WebElement size;
		
		@FindBy(id="qty")
		WebElement quantity;
		
		@FindBy(xpath="//div[@aria-label=\"Blue\"]")
		WebElement color;
		
		@FindBy(xpath="//button[@class=\"action primary tocart\"]/span")
		WebElement addtocard;
		
		@FindBy(xpath="//a[@class=\"action showcart\"]")
		WebElement showcard;
		
		public void addselectedproducttocard() throws InterruptedException{
			Thread.sleep(2000);
			size.click();
			scrollpage(color, driver);
			color.click();
			quantity.clear();
			Thread.sleep(1000);
			quantity.sendKeys("3");
			Thread.sleep(2000);
			scrollpage(addtocard, driver);
			addtocard.click();
		}
		public void gotoproductcard() throws InterruptedException{
			Thread.sleep(2000);
			scrollpage(showcard, driver);
			showcard.click();
		}
}
