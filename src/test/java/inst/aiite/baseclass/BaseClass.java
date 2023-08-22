package inst.aiite.baseclass;


	import java.awt.AWTException;
	import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
	import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClass {
		public static WebDriver driver;
		public static TakesScreenshot ts;
		public static Alert al;
		public static  Select s;
		public static Actions ac;
		public static JavascriptExecutor js;
		public static Robot rt;
		public static WebDriverWait wait;
		public static Wait waitfluent;
		public static WebElement element;
		public static String value;
		public static String loginlocation="C:\\Users\\503829\\eclipse-workspace\\CheapAirProj\\src\\test\\resources\\logindetails.properties";
		
								
		public static void launchingBrowser(String browser)
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			switch(browser) 
			{
			case ("chrome"):
				System.setProperty("webdriver.chrome.driver","C:\\Users\\503829\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				driver=new ChromeDriver(options);
				break;
			case ("firefox"):
				System.setProperty("webdriver.gecko.driver","C:\\Users\\503829\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
				driver=new FirefoxDriver();
				break;
			case ("edge"):
				System.setProperty("webdriver.edge.driver","C:\\Users\\503829\\Desktop\\New folder\\Seleniumfiles\\edgedriver_win64\\msedgedriver.exe");
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("Please select the valid browser");
				break;
			}
		}
		public static void urllaunch(String url)
		{
			try {
				driver.get(url);
			}
			catch(Exception e)
			{
				
			}
		}
		public static void maximizeWindowSize()
		{
			try {
				driver.manage().window().maximize();	
			}
			catch(Exception e) {
				
			}
		}
		public static void sleepThread(long mseconds) throws InterruptedException {
			try {
				Thread.sleep(mseconds);	
			}
			catch(Exception e)
			{
				
			}
		}
		public static WebElement findElementById(String idValue) {
			try {
				WebElement element=driver.findElement(By.id(idValue));
				return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}
		public static WebElement findElementBy(By keyValue) {
			try {
				WebElement element=driver.findElement(keyValue);
				return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}

		public static WebElement findElementByName(String nameValue) {
			try
			{
			WebElement element=driver.findElement(By.name(nameValue));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}

		public static WebElement findElementByClassName(String classnameValue) {
			try
			{
			WebElement element = driver.findElement(By.className(classnameValue));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
			
		}

		public static WebElement findElementByXpath(String xpathValue) {
			try {
			WebElement element = driver.findElement(By.xpath(xpathValue));
			return element;}
			
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}
		

		public static WebElement findElementByLinktext(String linktextValue) {
			try
			{
			WebElement element = driver.findElement(By.linkText(linktextValue));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
			
		}

		public static WebElement findElementByPartillinktext(String partiallinktextValue) {
			try
			{
			WebElement element = driver.findElement(By.partialLinkText(partiallinktextValue));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
			
		}
		public static WebElement findElementByTagName(String tagName) {
			try
			{
			WebElement element = driver.findElement(By.tagName(tagName));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}
		
		public static WebElement findElementByCssSelector(String attributevale) {
			try
			{
			WebElement element = driver.findElement(By.cssSelector(attributevale));
			return element;
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}
		
		public static void sendkeys(WebElement element,String sendkeysValue)
		{
			try {
				element.sendKeys(sendkeysValue);	
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			
		}
		public static void click_button(WebElement element)
		{
			try
			{
			element.click();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			
		}
		public static void navigateBackwardBrowser()
		{
			driver.navigate().back();
		}
		public static void navigateForwardBrowser()
		{
			driver.navigate().forward();
		}
		public static File takeScreenShot(String pathname) throws IOException
		{
			ts = (TakesScreenshot) driver;
			File f1 = ts.getScreenshotAs(OutputType.FILE);
			File path = new File(pathname);
			FileHandler.copy(f1, path);
			return f1;
		}
		public static void acceptAlert()
		{
			al=driver.switchTo().alert();
			al.accept();
		}
		public static void dismissAlert()
		{
			al=driver.switchTo().alert();
			al.dismiss();
		}
		public static String promptAlert(String value)
		{
			al=driver.switchTo().alert();
			al.sendKeys(value);
			al.accept();;
			return value;
		}
		public static Select dropDownoptions(WebElement element) {
			s = new Select(element);
			return s;

		}
		public static void selectByValueMethod(WebElement element, String keyValueSelect)
		{
			try {
				 s.selectByValue(keyValueSelect);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void selectByVisisbleText(WebElement element, String visibleText)
		{
			try {
			 s.selectByVisibleText(visibleText);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void selectByIndexValue(WebElement element, int indexValue)
		{
			try
			{
			 s.selectByIndex(indexValue);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void getSelectOptions(WebElement element)
		{
			try {
				List<WebElement> li=s.getOptions();
				for (WebElement ref : li) {
					System.out.println( ref.getText());
			}
			}
				catch(Exception e)
				{
					System.out.println("Error"+ e);
				}
				
			}
		public static void selectAllOptions(WebElement element)
		{
			try {
				List< WebElement> selectedoptions=s.getAllSelectedOptions();
				
				for (WebElement ref : selectedoptions) {
					System.out.println(ref.getText());
				}
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}

		}
		public static void getFirstOptionSelected(WebElement element)
		{
			try
			{
			WebElement firstOption=s.getFirstSelectedOption();
			 System.out.println("firstOption : "+ firstOption.getText());
			}
			 catch(Exception e)
				{
					System.out.println("Error"+ e);
				}
		}
		public static void selectoptionsIsMultiple(WebElement element)
		{
			try {
				boolean ismultiple=s.isMultiple();
				System.out.println("ismultiple "+ ismultiple);	
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}

		}
		public static void deSelectByVisisbleTextMethod(WebElement element, String visibleText)
		{
			try {
			  s.deselectByVisibleText(visibleText);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void deSelectByValueMethod(WebElement element, String keyValue)
		{
			try
			{
			 s.deselectByValue(keyValue);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void deSelectByIndexMethod(WebElement element, int indexValue)
		{
			try
			{
			s.deselectByIndex(indexValue);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void deSelectAllOptions(WebElement element)
		{
			try {
			s.deselectAll();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void doubleClickMethod(WebElement element)
		{
			try
			{
			ac = new Actions(driver);
			ac.doubleClick(element);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void ClickMethod(WebElement element)
		{
			try
			{
			ac = new Actions(driver);
			ac.click(element);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void contextClickMethod(WebElement element)
		{
			try
			{
			ac.contextClick(element);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void dragAndDropMethod(WebElement dragElementValue,WebElement dropElementValue)
		{
			try {
			ac.dragAndDrop(dragElementValue, dropElementValue);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}

		}
		public static void moveToElementMethod(WebElement element)
		{
			try
			{
			ac.moveToElement(element);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void keyUpandDown(WebElement element,String sendkeysValue)
		{
			try
			{
			ac.keyDown(Keys.CONTROL);
			ac.sendKeys(sendkeysValue);
			ac.keyUp(Keys.CONTROL);
			ac.perform();
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void tabKey()
		{
			ac.sendKeys(Keys.TAB);
			ac.perform();
		}
		
		public static void implicitWait(int milliseconds)
		{
			try {
			driver.manage().timeouts().implicitlyWait(milliseconds, TimeUnit.MILLISECONDS);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
//		public static void explicitWait(WebElement element, int milliseconds)
//		{
//			try
//			{
//			wait = new WebDriverWait(driver, milliseconds);
//			wait.until(ExpectedConditions.elementToBeClickable(element));
//			}
//			catch(Exception e)
//			{
//				System.out.println("Error"+ e);
//			}
//		}
//		@SuppressWarnings({ "unchecked", "deprecation" })
		public static void fluentWait(long milliseconds)
		{
			waitfluent = new FluentWait(driver)
					.withTimeout(Duration.ofSeconds(milliseconds))
					.pollingEvery(Duration.ofSeconds(milliseconds))
					.ignoring(NoSuchElementException.class);
			
				}
			
		
		public static void frameByIndex(int index) {
			try {
			driver.switchTo().frame(index);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void frameById(String id) {
			try
			{
			driver.switchTo().frame(id);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void frameByName(String name) {
			try
			{
			driver.switchTo().frame(name);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void frameByElement(WebElement element)
		{
			try
			{
			driver.switchTo().frame(element);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		
		public static void closeWindow() {
			driver.close();
		}
		
		public static Object executeScriptMethod(String attributeValue,WebElement element)
		{
			try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript(attributeValue, element);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			return element;
		}
		public static void escapeKeyPress()throws AWTException
		{
			rt = new Robot();
			rt.keyPress(KeyEvent.VK_ESCAPE);
			
		}
		public static void keyRelease(int keyCode) throws AWTException
		{
			try {
			rt.keyRelease(keyCode);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void keyRelease(String attributeValue)
		{
			try {
			js.executeScript(attributeValue);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void clear(WebElement element) {
			try {
			element.clear();
			} 
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			}
		public static void navigateTo(String url) {
			try {
			driver.navigate().to(url);
			}
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
			}
//		public static void getAttribute(WebElement element, String attrName) {
//			try {
//			String text = element.getAttribute(attrName);
//			System.out.println(text);
//			}
//			catch(Exception e)
//			{
//				System.out.println("Error"+ e);
//			}
//			}
		public static String getAttribute(WebElement element) {
			return element.getAttribute("value");
		}
		public static void getText(WebElement element) {
			try {
			String text = element.getText();
			System.out.println(text);
			} 
			catch(Exception e)
			{
				System.out.println("Error"+ e);
			}
		}
		public static void clearfield(WebElement element)
		{
			element.clear();
		}
		public static String propRead(String key) {
			String value=" ";
			try {
				FileReader read = new FileReader(loginlocation);
				Properties prop = new Properties();
				prop.load(read);			
				value=prop.getProperty(key);			
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
		}
		public static void excelWrite(String data, String sh)
		{
			try {
				String fpath="C:\\Users\\503829\\eclipse-workspace\\CheapAirProj\\src\\test\\resources\\CheapAir.xlsx";
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.createSheet(sh);
				Row cRow=sheet.createRow(1);
				Cell cCell=cRow.createCell(2);
				cCell.setCellValue(data);
				
				FileOutputStream fos=new FileOutputStream(f);
				wb.write(fos);
				wb.close();
				System.out.println("created");
				
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		public static String readsinglevalue(int r, int c, String sh)
//		{
//			try {
//				String fpath="C:\\Users\\503829\\eclipse-workspace\\AprilProject\\src\\test\\resources\\HotelTask.xlsx";
//				File f=new File(fpath);
//				FileInputStream fis=new FileInputStream(f);
//				Workbook wb=new XSSFWorkbook(fis);
//				Sheet sheet=wb.getSheet("sheet1");
//				Row row=sheet.getRow(r);
//				Cell cell=row.getCell(c);
//				int cellType=cell.getCellType();
//				if(cellType==1)
//				{
//					value=cell.getStringCellValue();
//					System.out.println(value);
//				}
//				else if(cellType==0)
//					if(DateUtil.isCellDateFormatted(cell))
//					{
//						Date dateCellValue=cell.getDateCellValue();
//						SimpleDateFormat sc=new SimpleDateFormat("DD/MM/YYYY");
//						value=sc.format(dateCellValue);
//						System.out.println(value);
//					}
//					else
//					{
//						double numCellValue=cell.getNumericCellValue();
//						long a=(long) numCellValue;
//						value=String.valueOf(a);
//					}
//				}
//			
//			catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return value;
//		}
		
		public static String readsinglevalue(int r, int c, String sh)
		{
			try {
				String fpath="C:\\Users\\503829\\eclipse-workspace\\CheapAirProj\\src\\test\\resources\\CheapAir.xlsx";
				File f=new File(fpath);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb=new XSSFWorkbook(fis);
				Sheet sheet=wb.getSheet("sheet1");
				Row row=sheet.getRow(r);
				Cell cell=row.getCell(c);
				@SuppressWarnings("deprecation")
				int cellType=cell.getCellType();
				if(cellType==1)
				{
					value=cell.getStringCellValue();
					
				}
				else if(cellType==0)
				{
					if(DateUtil.isCellDateFormatted(cell))
					{
						Date dateCellValue=cell.getDateCellValue();
						SimpleDateFormat sc=new SimpleDateFormat("dd/MM/yyyy");
						value=sc.format(dateCellValue);
						
					}
					else
					{
						double numCellValue=cell.getNumericCellValue();
						long a=(long)numCellValue;
						value=String.valueOf(a);
					}
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return value;
		}
		public static void quitWindow()
		{
			driver.quit();
		}
		
	}


