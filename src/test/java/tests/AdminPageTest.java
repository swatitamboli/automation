package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import constants.Constants;

import pages.AdminPage;

public class AdminPageTest extends BaseTest {
@Test
public void verifyUsername() 
{
AdminPage adminpage=homePage.navigateToAdminPage();	
boolean actual=adminpage.getUsername();
Assert.assertEquals(actual,true);

}
@Test
public void isSearchButtonPresent() 
{
	AdminPage adminpage=homePage.navigateToAdminPage();	
	Assert.assertEquals(adminpage.isSearchButtonPresent(), true);
}
}
