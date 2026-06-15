package com.test.automation;
import org.testng.annotations.Test;
import POM.POM_Implementation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException; import java.net.URL;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
public class BaseTest {
WebDriver driver;
WebDriverWait wait;
JavascriptExecutor js;
POM_Implementation p;
//@DataProvider(name="NameExcel")
//public Object[][] nameexcel() throws IOException {
//
//    FileInputStream fs = new FileInputStream(
//        "C:\\Users\\surla\\OneDrive\\phone img\\OneDrive\\Documents\\sample_pdf.xlsx");
//
//    XSSFWorkbook workbook = new XSSFWorkbook(fs);
//    XSSFSheet sheet = workbook.getSheet("sheet1");
//
//    int rows = sheet.getPhysicalNumberOfRows();
//
//    Object[][] data = new Object[rows - 1][1];
//
//    for (int i = 1; i < rows; i++) {
//        data[i - 1][0] = sheet.getRow(i).getCell(0).toString();
//        System.out.println("Name = " + data[i - 1][0]);
//    }
//
//    workbook.close();
//    fs.close();
//
//    return data;
//}
//@DataProvider(name="EmailExcel")
//public Object[][] emailexcel() throws IOException{
//FileInputStream fs=new
//FileInputStream("C:\\Users\\surla\\OneDrive\\phone img\\OneDrive\\Documents\\sample.pdf.xlsx");
//XSSFWorkbook workbook=new XSSFWorkbook(fs);
//XSSFSheet sheet=workbook.getSheet("sheet1");
//int rows=sheet.getPhysicalNumberOfRows();
//int cols=sheet.getRow(0).getLastCellNum();
//Object[][] data=new Object[rows-1][cols];
//for(int i=1;i<rows;i++) { for(int j=0;j<cols;j++) {
//data[i-1][j]=sheet.getRow(i).getCell(1).toString();
//}
//}
//fs.close();
//workbook.close();
//return data;
//}
//@DataProvider(name="MobileNumberExcel")
//public Object[][] mobilenumberexcel() throws IOException{
//FileInputStream fs=new
//FileInputStream("C:\\Users\\surla\\OneDrive\\phone img\\OneDrive\\Documents\\sample.pdf.xlsx");
//XSSFWorkbook workbook=new XSSFWorkbook(fs);
//XSSFSheet sheet=workbook.getSheet("sheet1");
//int rows=sheet.getPhysicalNumberOfRows();
//int cols=sheet.getRow(0).getLastCellNum();
//Object[][] data=new Object[rows-1][cols];
//for(int i=1;i<rows;i++) {
//for(int j=0;j<cols;j++) {
//data[i-1][j]=sheet.getRow(i).getCell(2).toString();
//}
//} fs.close();
//workbook.close();
//return data;
//}
//@DataProvider(name="AddressExcel")
//public Object[][] addressexcel() throws IOException{
//FileInputStream fs=new
//FileInputStream("C:\\Users\\surla\\OneDrive\\phone img\\OneDrive\\Documents\\sample.pdf.xlsx");
//XSSFWorkbook workbook=new XSSFWorkbook(fs);
//XSSFSheet sheet=workbook.getSheet("sheet1");
//int rows=sheet.getPhysicalNumberOfRows();
//int cols=sheet.getRow(0).getLastCellNum();
//Object[][] data=new Object[rows-1][cols];
//for(int i=1;i<rows;i++) {
//for(int j=0;j<cols;j++) {
//data[i-1][j]=sheet.getRow(i).getCell(3).toString();
//}
//}
//fs.close();
//workbook.close();
//return data;
//}
@DataProvider(name="searchdata")
public Object[][] data(){
return new Object[][] {
{"King"}, };
}
@DataProvider(name="paragraph")
public Object[][] paragraphbox(){
return new Object[][] {
{"You know why my World is Beautiful?","Why??","Because, it's you!."
}};
}
@BeforeMethod
public void beforeMethod() throws InterruptedException, MalformedURLException {
driver=new ChromeDriver();
p=new POM_Implementation(driver);
driver.get("https://testautomationpractice.blogspot.com/");
Thread.sleep(3000);
driver.manage().window().maximize();
}
@Test
public void fillForm() throws InterruptedException {

    p.Name_Element("Bala");
    p.Email_Element("bala@gmail.com");
    p.Phonenumber_Element("9547783210");
    p.Address("Vizag");
}
//@Test(dataProvider="NameExcel",priority=1) public void GUI_ELEMENTSName(String name) throws
//InterruptedException {
//p.Name_Element(name);
//}
//@Test(dataProvider="EmailExcel",priority=2)
//public void GUI_ELEMENTSEmail(String email) throws
//InterruptedException {
//p.Email_Element(email);
//}
//@Test(dataProvider="MobileNumberExcel",priority=3)
//public void GUI_ELEMENTSMobileNumber(String mobilenumber)
//throws InterruptedException {
//p.Phonenumber_Element(mobilenumber);
//}
//@Test(dataProvider="AddressExcel",priority=4)
//public void GUI_ELEMENTSAAddress(String address) throws
//InterruptedException {
//p.Address(address);
//}
@Test(priority=5)
public void Radio_and_CheckButtons() throws InterruptedException {
p.radio_checkbox();
}
@Test(priority=6) public void uploadfiles() throws InterruptedException {
p.upload();
}
@Test(priority=7)
public void Pagination_Table() throws InterruptedException {
p.page_table();
}
@Test(dataProvider="paragraph",priority=8)
public void Forms(String firstparagraph,String secondparagraph,String
thirdparagraph) throws InterruptedException {
p.forms(firstparagraph,secondparagraph,thirdparagraph);	
}
@Test(dataProvider="searchdata",priority=9)
public void Search(String searchitem) throws InterruptedException {
p.search(searchitem);
}
@Test(priority=10)
public void Dynamicbutton() throws InterruptedException {
p.dynamicbtn();
}
@Test(priority=11)
public void AlertsandPopups() throws InterruptedException {
p.alertaccept(); }
@Test(priority=12)
public void window_Handling() throws InterruptedException {
p.newtab();
}
@Test(priority=13)
public void multiple_windowHandling() throws InterruptedException {
p.multiplewindow();
}
@Test(priority=14)
public void Mouse_Hover() throws InterruptedException {
p.movetoelement();
}
@Test(priority=15)
public void DoubleClick() throws InterruptedException {
p.doubleclick();
}
@Test(priority=16)
public void DragandDrop() throws InterruptedException {
p.draganddrop();
}
@Test(priority=17) public void Slider() throws InterruptedException {
p.slider();
}
@Test(priority=18)
public void Scrolling_Dropdown() throws InterruptedException {
p.scrolling_dropdown();
}
@Test(priority=19)
public void LaptopLinks() throws InterruptedException {
p.links();
}
//@Test(priority=20)
//public void Broken_Links() throws InterruptedException, IOException {
//p.broken_links();
//}
@AfterMethod
public void afterMethod() {
driver.quit();
}
}