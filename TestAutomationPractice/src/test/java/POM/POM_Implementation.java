package POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POM_Implementation {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	TakesScreenshot ts;

	public POM_Implementation(WebDriver driver) {

		this.driver = driver;

	}

	// GUI Elements
	By namefield = By.id("name");
	By emailfield = By.id("email");
	By phonefield = By.id("phone");
	By addressfield = By.id("textarea");
	By radiobutton = By.id("male");
	By sundaycheckbox = By.id("sunday");
	By mondaycheckbox = By.id("monday");
	By tuesdaycheckbox = By.id("tuesday");
	By wednesdaycheckbox = By.id("wednesday");
	By thursdaycheckbox = By.id("thursday");
	By fridaycheckbox = By.id("friday");
	By saturdaycheckbox = By.id("saturday");
	By countrydropdown = By.id("country");
	By colorselect = By.id("colors");
	By Listselect = By.id("animals");
	By datepicker1 = By.id("datepicker");
	By datepicker2 = By.id("txtDate");
	By datepicker2year = By.className("ui-datepicker-year");
	By datepicker2month = By.className("ui-datepicker-month");
	By datepicker3startdate = By.id("start-date");
	By datepicker3enddate = By.id("end-date");
	By submitbutton = By.className("submit-btn");

	// Files
	By singlefileupload = By.id("singleFileInput");
	By multiplefileupload = By.id("multipleFilesInput");

	// Pagination Table
	By checkbox1 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input");
	By checkbox2 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input");
	By checkbox3 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input");
	By checkbox4 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input");
	By checkbox5 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input");
	By secondpage = By.linkText("2");
	By checkbox6 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input");
	By checkbox7 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input");
	By checkbox8 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input");
	By checkbox9 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input");
	By checkbox10 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input");
	By thirdpage = By.linkText("3");
	By checkbox11 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input");
	By checkbox12 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input");
	By checkbox13 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input");
	By checkbox14 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input");
	By checkbox15 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input");
	By fourthpage = By.linkText("4");
	By checkbox16 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input");
	By checkbox17 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input");
	By checkbox18 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input");
	By checkbox19 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input");
	By checkbox20 = By.xpath("//*[@id=\"productTable\"]/tbody/tr[5]/td[4]/input");

	// Forms
	By firsttextbox = By.id("input1");
	By secondtextbox = By.id("input2");
	By thirdtextbox = By.id("input3");
	By submitbutton1 = By.id("btn1");
	By submitbutton2 = By.id("btn2");
	By submitbutton3 = By.id("btn3");

	// Dynamic button
	By dynamicbuttonclick = By.name("start");

	// new tab button
	By newtabclickbutton = By.xpath("//*[@id=\"HTML4\"]/div[1]/button");

	By popupwindow = By.id("PopUp");

	// mouse
	By mousehover = By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button");

	// doubleClick copy
	By copybutton = By.xpath("//button[@ondblclick=\"myFunction1()\"]");

	// Drag and Drop
	By source = By.id("draggable");
	By destination = By.id("droppable");

	// Slider
	By pointer1 = By.xpath("//*[@id=\"slider-range\"]/span[1]");
	By pointer2 = By.xpath("//*[@id=\"slider-range\"]/span[2]");

	// ScrollDown
	By Dropdown = By.id("comboBox");
	By item = By.xpath("//*[@id=\"dropdown\"]/div[5]");

	// Search
	By searchbox = By.id("Wikipedia1_wikipedia-search-input");
	By searchbutton = By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input");
	By searchsuggestion = By.linkText("King");

	// Links
	By applelink = By.id("apple");
	By lenovolink = By.id("lenovo");
	By delllink = By.id("dell");

	// AlertButton
	By alertbutton = By.id("alertBtn");

	// BrokenLinks
	By Errorcode400 = By.linkText("Errorcode 400");
	By Errorcode401 = By.linkText("Errorcode 401");
	By Errorcode403 = By.linkText("Errorcode 403");
	By Errorcode404 = By.linkText("Errorcode 404");
	By Errorcode408 = By.linkText("Errorcode 408");
	By Errorcode100 = By.linkText("Errorcode 100");
	By Errorcode502 = By.linkText("Errorcode 502");
	By Errorcode503 = By.linkText("Errorcode 503");

	public void Name_Element(String name) throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)");

		Thread.sleep(100);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(namefield));

		firstname.click();

		Thread.sleep(100);
		System.out.println("fname = " + name);

		firstname.sendKeys(name);

		Thread.sleep(100);

		System.out.println("Firstname entered successfully");
	}

	public void Email_Element(String email) throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,150)");

		Thread.sleep(100);

		WebElement Email = driver.findElement(emailfield);

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(emailfield));

		Email.click();

		Thread.sleep(100);
		System.out.println("email = " + email);

		Email.sendKeys(email);

		Thread.sleep(100);

		System.out.println("Email entered successfully");

	}

	public void Phonenumber_Element(String mobilenumber) throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		Thread.sleep(100);

		WebElement phonenumber = driver.findElement(phonefield);

		phonenumber.click();

		Thread.sleep(100);

		phonenumber.sendKeys(mobilenumber);
		System.out.println("mobilenumber = " + mobilenumber);

		Thread.sleep(100);

		System.out.println("Mobilenumber entered successfully");
	}

	public void Address(String address) throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		Thread.sleep(100);

		WebElement addres = driver.findElement(addressfield);

		addres.click();

		Thread.sleep(100);

		addres.sendKeys(address);
		Thread.sleep(100);
		
		System.out.println("address = " + address);

		System.out.println("Address entered successfully");

		Thread.sleep(100);

	}
	
	public void radio_checkbox() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,900)");

		driver.findElement(radiobutton).click();

		Thread.sleep(100);

		driver.findElement(sundaycheckbox).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(mondaycheckbox).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(tuesdaycheckbox).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(wednesdaycheckbox).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(thursdaycheckbox).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(fridaycheckbox).click();

		Thread.sleep(100);

		driver.findElement(saturdaycheckbox).click();
		
		System.out.println("Weekday checkbox clicked");

		Thread.sleep(100);

		WebElement selectcountry = driver.findElement(countrydropdown);

		selectcountry.click();

		Thread.sleep(100);

		Select s = new Select(selectcountry);

		s.selectByVisibleText("India");
		
		System.out.println("Country Selected successfully");

		Thread.sleep(100);

		WebElement selectcolor = driver.findElement(colorselect);

		selectcolor.click();

		Thread.sleep(100);

		Select color = new Select(selectcolor);

		color.selectByVisibleText("Green");
		
		System.out.println("Colors Selected successfully");

		WebElement selectsortedList = driver.findElement(Listselect);

		selectsortedList.click();

		Thread.sleep(100);

		Select sortedlist = new Select(selectsortedList);

		sortedlist.selectByVisibleText("Lion");
		
		System.out.println("Animals Selected successfully");

		Thread.sleep(100);

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,300)");

		Thread.sleep(100);

		WebElement firstdate = driver.findElement(datepicker1);

		Thread.sleep(100);

		firstdate.sendKeys("07/16/2026");

		Thread.sleep(100);
		
		System.out.println("Firstdate entered successfully");
		
		driver.findElement(datepicker1).sendKeys(Keys.ENTER);
		
		 WebElement seconddate=driver.findElement(datepicker2); 
		  
		 seconddate.click();
		  
		  Thread.sleep(100);
		  
		  WebElement year=driver.findElement(datepicker2year);
		  
		  Select y=new Select(year);
		  
		  y.selectByVisibleText("2026");
		  
		  Thread.sleep(100);
		  
		  WebElement month=driver.findElement(datepicker2month);
		  
		  Select m=new Select(month);
		 
		  m.selectByVisibleText("May");
		  
		  Thread.sleep(100);
		  
		  driver.findElement(By.xpath("//a[text()='17']")).click();
		  
		  System.out.println("Second date entered successfully");
		  
		  Thread.sleep(100);

		WebElement thirdstartdate = driver.findElement(datepicker3startdate);

		thirdstartdate.sendKeys("12-06-2026");

		Thread.sleep(100);

		WebElement thirdenddate = driver.findElement(datepicker3enddate);

		thirdenddate.sendKeys("5-6-2027S");
		
		System.out.println("Thirddate entered successfully");

		Thread.sleep(100);

		driver.findElement(submitbutton).click();
		
		System.out.println("Submit button successfully");

		Thread.sleep(100);

	}

	public void upload() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1700)");

		Thread.sleep(100);

		WebElement singlefile = driver.findElement(singlefileupload);

		singlefile.sendKeys(
				"C:\\Users\\surla\\OneDrive\\Desktop\\huskey\\WhatsApp Image 2026-01-07 at 11.12.41 PM (1).jpeg");

		System.out.println("Single File Uploaded Successfully");

		Thread.sleep(100);

		WebElement multiplefiles = driver.findElement(multiplefileupload);

		multiplefiles.sendKeys(
				"C:\\Users\\surla\\OneDrive\\Desktop\\huskey\\WhatsApp Image 2026-01-07 at 11.12.41 PM (1).jpeg" + "\n"
						+ "C:\\Users\\surla\\OneDrive\\Desktop\\huskey\\WhatsApp Image 2026-01-07 at 11.12.42 PM (1).jpeg");

		System.out.println("Multiple File Uploaded Successfully");

		Thread.sleep(100);
	}

	public void page_table() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2700)");

		Thread.sleep(100);

		driver.findElement(checkbox1).click();

		Thread.sleep(100);

		driver.findElement(checkbox2).click();

		Thread.sleep(100);

		driver.findElement(secondpage).click();
		
		Thread.sleep(100);
		
		driver.findElement(checkbox6).click();

		Thread.sleep(100);

		driver.findElement(checkbox7).click();

		Thread.sleep(100);

		driver.findElement(checkbox8).click();

		Thread.sleep(100);
//
//		driver.findElement(checkbox9).click();
//
//		Thread.sleep(100);
//
//		driver.findElement(checkbox10).click();
//
//		Thread.sleep(100);

		driver.findElement(thirdpage).click();

		Thread.sleep(100);

		driver.findElement(checkbox15).click();

		Thread.sleep(100);

		driver.findElement(fourthpage).click();

		Thread.sleep(100);
		driver.findElement(checkbox17).click();

		Thread.sleep(100);
		driver.findElement(checkbox20).click();

		Thread.sleep(100);

	}

	public void forms(String firstparagraph, String secondparagraph, String thirdparagraph)
			throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)");

		Thread.sleep(100);

		driver.findElement(firsttextbox).sendKeys(firstparagraph);

		Thread.sleep(100);

		driver.findElement(submitbutton1).click();

		System.out.println("Form 1 Submitted Successfully");

		Thread.sleep(100);

		driver.findElement(secondtextbox).sendKeys(secondparagraph);

		Thread.sleep(100);

		driver.findElement(submitbutton2).click();

		System.out.println("Form 2 Submitted Successfully");

		Thread.sleep(100);

		driver.findElement(thirdtextbox).sendKeys(thirdparagraph);

		Thread.sleep(100);

		driver.findElement(submitbutton3).click();

		System.out.println("Form 3 Submitted Successfully");

		Thread.sleep(100);
	}

	public void search(String searchitem) throws InterruptedException {

		WebElement text = driver.findElement(searchbox);

		text.click();

		Thread.sleep(100);

		System.out.println("Search textbox Clicked Successfully");

		text.sendKeys(searchitem);

		Thread.sleep(100);

		driver.findElement(searchbutton).click();

		System.out.println("Item Searched Successfully");

		Thread.sleep(1000);

		String pwindow = driver.getWindowHandle();

		driver.findElement(searchsuggestion).click();

		Thread.sleep(100);

		Set<String> nwindow = driver.getWindowHandles();

		for (String window : nwindow) {

			if (!window.equals(pwindow)) {

				driver.switchTo().window(window);
			}
		}

		Thread.sleep(100);

		driver.close();

		driver.switchTo().window(pwindow);
	}

	public void dynamicbtn() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,900)");

		driver.findElement(dynamicbuttonclick).click();
		;

		System.out.println("Dynamic Start Button Successfully");

		Thread.sleep(100);

	}

	public void alertaccept() throws InterruptedException {

		driver.findElement(alertbutton).click();

		Alert al = driver.switchTo().alert();

		Thread.sleep(100);

		al.accept();

		System.out.println("Simple alert Accepted");

		driver.findElement(By.id("confirmBtn")).click();

		Thread.sleep(100);

		Alert a = driver.switchTo().alert();

		Thread.sleep(100);

		a.dismiss();

		System.out.println("Confirmation alert dismissed");

		driver.findElement(By.id("promptBtn")).click();

		Alert s = driver.switchTo().alert();

		Thread.sleep(100);

		s.accept();

		System.out.println("Prompt alert Accepted");

		Thread.sleep(100);

	}

	public void newtab() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,100)");

		String oldwindow = driver.getWindowHandle();

		driver.findElement(newtabclickbutton).click();

		Thread.sleep(100);

		Set<String> newwindow = driver.getWindowHandles();

		for (String window : newwindow) {

			if (!window.equals(oldwindow)) {

				driver.switchTo().window(window);
			}
		}

		driver.close();

		driver.switchTo().window(oldwindow);

		Thread.sleep(100);

		System.out.println("Window successfully Handled");

	}

	public void multiplewindow() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)");

		Thread.sleep(100);

		String old = driver.getWindowHandle();

		driver.findElement(popupwindow).click();

		Thread.sleep(1000);

		Set<String> newwindows = driver.getWindowHandles();

		for (String windows : newwindows) {

			if (!windows.equals(old)) {

				driver.switchTo().window(windows);
			}
		}
		driver.close();

		driver.switchTo().window(old);
	}

	public void movetoelement() throws InterruptedException {

		js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");

		WebElement moveto = driver.findElement(mousehover);

		Actions a = new Actions(driver);

		a.moveToElement(moveto).perform();

		System.out.println("Moving pointer to the element is successful");

		Thread.sleep(100);

	}

	public void doubleclick() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1100)");

		Thread.sleep(100);

		WebElement copy = driver.findElement(copybutton);

		Actions c = new Actions(driver);

		c.doubleClick(copy).perform();

		System.out.println("Text copied and pasted");

		Thread.sleep(100);

	}

	public void draganddrop() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1400)");

		Thread.sleep(100);

		WebElement drag = driver.findElement(source);

		WebElement drop = driver.findElement(destination);

		Actions d = new Actions(driver);

		d.dragAndDrop(drag, drop).perform();

		System.out.println("Element dragged and dropped into the destination");

		Thread.sleep(100);
	}

	public void slider() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1600)");

		Thread.sleep(100);

		WebElement point1 = driver.findElement(pointer1);

		Actions e = new Actions(driver);

		e.dragAndDropBy(point1, 35, 1).perform();

		System.out.println("Point 1 Slided Successfully");

		Thread.sleep(100);

		WebElement point2 = driver.findElement(pointer2);

		Actions f = new Actions(driver);

		f.dragAndDropBy(point2, 100, 0).perform();

		System.out.println("Point 2 Slided Successfully");

		Thread.sleep(100);
	}

	public void scrolling_dropdown() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2100)");

		Thread.sleep(100);

		WebElement drop = driver.findElement(Dropdown);

		drop.click();

		Thread.sleep(100);

		WebElement items = driver.findElement(item);

		items.click();

		Thread.sleep(100);

	}

	public void links() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2600)");

		Thread.sleep(100);

		driver.findElement(applelink).click();

		Thread.sleep(100);

//		String expectedtitle = "Apple";
//
//		String actualtitle = driver.getTitle();
//
//		Assert.assertEquals(expectedtitle, actualtitle, "Title Validation Failed");
//
//		driver.navigate().back();
//
//		Thread.sleep(100);
//
//		driver.findElement(lenovolink).click();
//
//		Thread.sleep(100);

		String expectedurl = "https://www.lenovo.com/in/en/?orgRef=https%253A%252F%252Ftestautomationpractice.blogspot.com%252F";

		String currenturl = driver.getCurrentUrl();

		if (expectedurl.equals(currenturl)) {

			System.out.println("URL Validation Passed");
		} else {

			System.out.println("URL Validation Failed");
		}

		driver.navigate().back();

		Thread.sleep(100);

		driver.findElement(delllink).click();

		Thread.sleep(100);

		String sourcecode = driver.getPageSource();

		System.out.println("Page source is:" + sourcecode);

		Thread.sleep(100);
	}

	public void broken_links() throws InterruptedException, IOException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,2700)");

		Thread.sleep(100);

		WebElement title1 = driver.findElement(Errorcode400);

		title1.click();

		ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("Screenshot/Error400.png");

		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot of Error 400 took Successfully");

		Thread.sleep(100);

		driver.navigate().back();

		Thread.sleep(100);

		WebElement title2 = driver.findElement(Errorcode401);

		title2.click();

		String text2 = driver.getTitle();

		System.out.println("Error status is" + text2);

		Thread.sleep(100);

		driver.navigate().back();

		Thread.sleep(100);

//		WebElement title3 = driver.findElement(Errorcode403);
//
//		title3.click();
//
//		String text3 = driver.getTitle();
//
//		System.out.println("Error status is" + text3);
//
//		Thread.sleep(100);
//
//		driver.navigate().back();
//
//		Thread.sleep(100);

		WebElement title4 = driver.findElement(Errorcode404);

		title4.click();

		String text4 = driver.getTitle();

		System.out.println("Error status is" + text4);

		Thread.sleep(100);

		driver.navigate().back();

		Thread.sleep(100);

//	*	WebElement title5 = driver.findElement(Errorcode408);
//
//		title5.click();
//
//		ts = (TakesScreenshot) driver;
//
//		File src1 = ts.getScreenshotAs(OutputType.FILE);
//
//		File des1 = new File("Screenshot/Error408.png");
//
//		FileUtils.copyFile(src1, des1);
//
//		Thread.sleep(100);
//
//		driver.navigate().back();
//
//		Thread.sleep(100);

		WebElement title6 = driver.findElement(Errorcode100);

		title6.click();

		String text6 = driver.getTitle();

		System.out.println("Error status is" + text6);

		Thread.sleep(100);

		driver.navigate().back();

		Thread.sleep(100);

		WebElement title7 = driver.findElement(Errorcode502);

		title7.click();

		String text7 = driver.getTitle();

		System.out.println("Error status is" + text7);

		Thread.sleep(100);

		driver.navigate().back();

		Thread.sleep(100);
//
//		WebElement title8 = driver.findElement(Errorcode503);
//
//		title8.click();
//
//		ts = (TakesScreenshot) driver;
//
//		File src2 = ts.getScreenshotAs(OutputType.FILE);
//
//		File des2 = new File("Screenshot/Error503.png");
//
//		FileUtils.copyFile(src2, des2);
//
//		Thread.sleep(100);
//
//		driver.navigate().back();
//
//		Thread.sleep(100);

	}

}