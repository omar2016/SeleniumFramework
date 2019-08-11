package pages;




import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;







public class SearchPage extends PageBase{
	public SearchPage(WebDriver driver) {
		super(driver);
		action =new Actions (driver);

	}

	@FindBy(xpath="(//*[@class='QVznTd'])[1]")
	public List<WebElement> tedlist;

	@FindBy(xpath="//*[@class='QVznTd']")
	public WebElement tedstr;

	@FindBy(xpath="//*[@class='poRVub']")
	public WebElement facbookicon;

	@FindBy(id="gbqfq")
	WebElement searchtxtfield ;

	@FindBy(xpath="//*[@id=\"gbqfb\"]")
	public WebElement searchbtn ;

	@FindBy(linkText="TED")
	public WebElement Tedicon ;

	@FindBy(css="img.T75of.sHb2Xb")
	public WebElement Tedassertimage ;

	public void userWritingOnSearchTxt (String appname )  {	
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTextElementText(searchtxtfield,appname) ;
		selectAPPMenu(searchbtn);			
	}

}