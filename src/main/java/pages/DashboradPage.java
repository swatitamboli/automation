package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboradPage {
WebDriver driver;
@FindBy(xpath = "//h6[text()='Dashboard']")
WebElement dashborad;
public DashboradPage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public boolean isDashboradPresent() 
{
	return dashborad.isDisplayed();
}
}
