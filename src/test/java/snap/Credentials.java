package snap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Credentials extends BaseClass
{
	
	public Credentials()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(id="login-continue")
	private WebElement continue_button;
	
	@FindBy(id="w_password")
	private WebElement pw;
	
	@FindBy(id="login-done")
	private WebElement login;
	
	@FindBy(id="make-payment")
	private WebElement payment_proceed;

	public WebElement getUn() {
		return un;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPayment_proceed() {
		return payment_proceed;
	}

}
