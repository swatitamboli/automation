package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	@FindBy(xpath = "//label[text()='Username']/following::input")
	WebElement Username;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;
WebDriver driver;
	

public AdminPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


public String getUsername() 
{
	Username.sendKeys("swati");
	return Username.getText();
}
public boolean isSearchButtonPresent() 
{
return searchButton.isDisplayed();	
}
}
