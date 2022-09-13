package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

import pages.DashboradPage;

public class DashboradPageTest extends BaseTest {
@Test
public void isDashboardPresent() 
{
	DashboradPage dashboradpage=homePage.navigateToDashboradPage();
	Assert.assertEquals(dashboradpage.isDashboradPresent(), true);
}
}
