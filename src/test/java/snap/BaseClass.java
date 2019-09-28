package snap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void BrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./src/test/java/broserDriver/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	public static void loadUR(String url)
	{
		driver.get(url);
	}
	public static void sendk(WebElement e, String value)
	{
		e.sendKeys(value);
	}
	public static void btncl(WebElement e)
	{
		e.click();
	}
	public static void geturl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void getTitle()
	{
		String tt = driver.getTitle();
		System.out.println(tt);
	}
	public static void pageloadtimeout(int time) 
	{
		driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
	}
	public static void selbyval(WebElement e,String value)
	{
	Select sl=new Select(e);
	sl.selectByValue(value);;
	
	}
	public static void moveEl(WebElement e)
	{
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
				
	}
	public static void alertAccept()
	{
		driver.switchTo().alert().accept();
	}
	public static String getData(int row,int col) throws Throwable
	{
		String s1=null;
		File f=new File("C:\\Users\\Roger\\eclipse-workspace\\Snapdeal\\Excel");
		FileInputStream fl=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fl);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(col);
		int type = c.getCellType();
		if(type==1)
		{
			s1=c.getStringCellValue();
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				Date d = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat();
				 s1 = sim.format(d);
			}
			else 
			{
				double k = c.getNumericCellValue();
				long l=(long)k;
				s1 = String.valueOf(l);
			}
		}
		return s1;
	}
}




