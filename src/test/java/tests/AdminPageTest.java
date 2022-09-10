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
String actual=adminpage.getUsername();
Assert.assertEquals(actual, Constants.ADMIN_PAGE_USERNAME);

}
}
