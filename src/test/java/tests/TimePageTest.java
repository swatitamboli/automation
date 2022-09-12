package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;
import constants.Constants;
import pages.TimePage;

public class TimePageTest extends BaseTest {
@Test
public void verifyEmployeeName()
{
	TimePage timepage=homePage.navigateToTimePage();
	String actual=timepage.getEmployeeName();
	Assert.assertEquals(actual, Constants.TIME_PAGE_EMPOLYEENAME);
}
}
