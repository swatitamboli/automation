package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimePage {
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement empName;
WebDriver driver;
public TimePage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public String getEmployeeName() 
{
	empName.sendKeys("swati");
	return empName.getText();
}
}
