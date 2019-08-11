package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.HomePageStore;
import pages.SearchPage;

public class FaceBookTest extends TestBase{

	HomePageStore homeObject ;
	String appname ="Facebook";
	SearchPage  Searchobject ;
	 WebDriverWait wait ;

	@Test(priority=1)
	public void userCansearchForFaceBook ()   {
		Searchobject =  new SearchPage (driver);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(Searchobject.searchbtn)) ;
		Searchobject.userWritingOnSearchTxt(appname);
		if(Searchobject.facbookicon.isDisplayed())
		{
			System.out.println("Icon displayed");
		}else{
			System.out.println("Icon notdisplayed");
		}	try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

}
