package snap;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPoja extends BaseClass
{
		
		public SearchPoja()
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\'621201948309\']/div[2]/a/picture/img")
		private WebElement item;

		public WebElement getItem() 
		{
			return item;
		}

		
		}

	

