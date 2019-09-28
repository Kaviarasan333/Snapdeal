package snap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuynowPoja extends BaseClass
{
	public BuynowPoja()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="buy-button-id")
	private WebElement buynow;

	public WebElement getBuynow() {
		return buynow;
	}

}
