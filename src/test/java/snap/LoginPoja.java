package snap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPoja extends BaseClass {
	
	public LoginPoja()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputValEnter")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[2]/button")
	private WebElement search;
	

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearch() {
		return search;
	}
	
	

}
