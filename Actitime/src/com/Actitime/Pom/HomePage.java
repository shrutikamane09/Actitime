package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	
		@FindBy(xpath = "//div[.='Tasks']")
		private WebElement tasktab;
		
		@FindBy(id= "logoutLink")
		private WebElement logoutlink;
		
	//initialisation
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//utilisation
		public WebElement getTasktab() {
			return tasktab;
		}

		public WebElement getLogoutlink() {
			return logoutlink;
		}
		
		
		
}
