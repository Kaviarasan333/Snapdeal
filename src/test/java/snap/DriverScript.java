package snap;

import java.util.Set;

public class DriverScript extends BaseClass
{
public static void main(String[] args) throws Throwable  
{

	BrowserLaunch();
	loadUR("https://www.snapdeal.com");
	LoginPoja po= new LoginPoja();
	sendk(po.getSearchbox(),"shoe");
	btncl(po.getSearch());
	SearchPoja sp=new SearchPoja();
	Thread.sleep(30000);
	
	String hand = driver.getWindowHandle();
	btncl(sp.getItem());
	Set<String> hands = driver.getWindowHandles();
	for(String s:hands)
	{
		driver.switchTo().window(s);
		
	}
	BuynowPoja bp=new BuynowPoja();
	btncl(bp.getBuynow());
	
	Credentials cp=new Credentials();
	Thread.sleep(20000);
			sendk(cp.getUn(), "9092421896");
			btncl(cp.getContinue_button());
			Thread.sleep(20000);
			sendk(cp.getPw(), "Vadalur@1234");
			btncl(cp.getLogin());
			Thread.sleep(20000);
			btncl(cp.getPayment_proceed());
	
}	

}
