package org.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.utility.ReusablityMethods;

public class shippingaddress extends ReusablityMethods{
	
	WebDriver driver;
	 String mycountry="India";
	 String mystate="Tamil Nadu";
	 
	   
		
		public shippingaddress(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	
		
		@FindBy(xpath="//span[contains(text(),'New Address')]")
		WebElement newaddress;
		
		@FindBy(xpath="//input[@name=\"company\"]")
		WebElement company;
		
		@FindBy(xpath="//input[@name=\"street[0]\"]")
		WebElement street1;
		
		@FindBy(xpath="//input[@name=\"street[1]\"]")
		WebElement street2;
		
		@FindBy(xpath="//input[@name=\"street[2]\"]")
		WebElement street3;
		
		@FindBy(xpath="//input[@name=\"city\"]")
		WebElement city;
		
		@FindBy(xpath="//select[@name=\"country_id\"]")
		WebElement country;
		
		@FindBy(xpath="//select[@name=\"region_id\"]")
		WebElement region;
		
		@FindBy(xpath="//input[@name=\"postcode\"]")
		WebElement pincode;
		
		@FindBy(xpath="//input[@name=\"telephone\"]")
		WebElement phone;
		
		@FindBy(xpath="//span[contains(text(),'Ship here')]")
		WebElement shiphereadd;
		
		@FindBy(xpath="//button[@class=\"button action continue primary\"]")
		WebElement continuebtn;
		
		@FindBy(xpath="//span[contains(text(),'Place Order')]//parent::button")
		WebElement placeorder;
		
	public void newaddressentry() throws InterruptedException {
		Thread.sleep(13000);
		scrollpage(newaddress, driver);
		newaddress.click();
		}
	public void filldetails(String companyname,String streetone,String streettwo,
			String streetthree,String cityname) throws InterruptedException {
		Thread.sleep(4000);
		company.sendKeys(companyname);
		street1.sendKeys(streetone);
		street2.sendKeys(streettwo);
		street3.sendKeys(streetthree);
		city.sendKeys(cityname);
	}
	public void fillfulldetails(String citypin,String myphone) throws InterruptedException {
		Thread.sleep(1000);
		selectmethodsbyText(driver, country, mycountry);
		Thread.sleep(1000);
		selectmethodsbyText(driver, region, mystate);
		pincode.sendKeys(citypin);
		phone.sendKeys(myphone);
		
	}
	public void orderplacing() throws InterruptedException {
		shiphereadd.click();
		Thread.sleep(1000);
		scrollpage(continuebtn, driver);
		continuebtn.click();
		Thread.sleep(7000);
		placeorder.click();
		
	}
		
		
		
		
		
		
		
		
//		Thread.sleep(18000);
//		WebElement newaddr=driver.findElement(By.xpath("//span[contains(text(),'New Address')]"));
//		js.executeScript("arguments[0].scrollIntoView();", newaddr);
//		newaddr.click();
//
//		// address fill
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("heerrinbee");
//		driver.findElement(By.xpath("//input[@name=\"street[0]\"]")).sendKeys("19222 logo plate mall");
//		driver.findElement(By.xpath("//input[@name=\"street[1]\"]")).sendKeys("logoase plate city");
//		driver.findElement(By.xpath("//input[@name=\"street[2]\"]")).sendKeys("logo town");
//		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("chennai");
//
//		Thread.sleep(1000);
//		// js.executeScript("arguments[0].click();", addcard);
//		WebElement countryList = driver.findElement(By.xpath("//select[@name=\"country_id\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", countryList);
//		Select selectcountry = new Select(countryList);
//		selectcountry.selectByVisibleText("India");
//
//		Thread.sleep(1000);
//		WebElement regionids = driver.findElement(By.xpath("//select[@name=\"region_id\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", regionids);
//		Select regions = new Select(regionids);
//		regions.selectByVisibleText("Tamil Nadu");
//
//		WebElement pincode = driver.findElement(By.xpath("//input[@name=\"postcode\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", pincode);
//		pincode.sendKeys("603113");
//
//		WebElement cellphone = driver.findElement(By.xpath("//input[@name=\"telephone\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", cellphone);
//		cellphone.sendKeys("2000766780");
//
//		// ship this address
//		driver.findElement(By.xpath("//span[contains(text(),'Ship here')]")).click();
//
//		WebElement continuebtn = driver.findElement(By.xpath("//button[@class=\"button action continue primary\"]"));
//		js.executeScript("arguments[0].scrollIntoView();", continuebtn);
//		Thread.sleep(1000);
//		continuebtn.click();
//
//		 Thread.sleep(7000);
//		 WebElement placeorders=driver.findElement(By.xpath("//span[contains(text(),'Place Order')]//parent::button"));
//		 js.executeScript("arguments[0].scrollIntoView();", placeorders);
//		 placeorders.click();
}
