package adaction.utilies;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AdActionBase 
{
	public static WebDriver driver;
	
	public static void browserlaunch(String key, String value,String browser) {
		// TODO Auto-generated method stub
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		else {
			System.setProperty(key, value);
			driver = new ChromeDriver();	
		}
		
	}
	public static void loadurl(String url) 
	{
		// TODO Auto-generated method stub
		driver.get(url);
	}
	
public static void login(WebElement element, String data) {
		
		element.sendKeys(data);
	}
	public static void password(WebElement element, String data) {
		
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}
	public static void clear(WebElement element) {
		// TODO Auto-generated method stub
		element.clear();
	}
	public static void selectLocation() {
		// TODO Auto-generated method stub
		WebElement select = driver.findElement(By.id("location"));
		Select s = new Select(select);
		s.selectByIndex(3);
	}
	public static void selectHotel() {
		// TODO Auto-generated method stub
		WebElement select = driver.findElement(By.id("hotels"));
		Select s = new Select(select);
		s.selectByIndex(4);
	}
	public static void selectRoom() {
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s = new Select(roomType);
		s.selectByIndex(2);
	}
	public static void selectNoOfRooms() {
		// TODO Auto-generated method stub
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		Select s = new Select(noOfRooms);
		s.selectByIndex(2);
	}
	public static void selectCheckInDate(WebElement element, String data) {
		// TODO Auto-generated method stub
		element.sendKeys(data);
	}
	public static void selectCheckOutDate(WebElement element, String data) {
		// TODO Auto-generated method stub
		element.sendKeys(data);
	}
	public static void selectNoOfAdults() {
		// TODO Auto-generated method stub
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s = new Select(adults);
		s.selectByIndex(2);
	}
	public static void selectChildRooms() {
		// TODO Auto-generated method stub
		WebElement childRooms = driver.findElement(By.id("child_room"));
		Select s = new Select(childRooms);
		s.selectByIndex(1);
	}
	public static void selectCardType() {
		// TODO Auto-generated method stub
		WebElement cardType = driver.findElement(By.id("cc_type"));
		Select s = new Select(cardType);
		s.selectByIndex(2);
	}
	public static void selectExpiryMonth() {
		// TODO Auto-generated method stub
		WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(expiryMonth);
		s.selectByIndex(02);
	}
	public static void selectExpiryYear() {
		// TODO Auto-generated method stub
		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
		Select s = new Select(expiryYear);
		s.selectByIndex(10);
	}
	public static void typeFirstName(WebElement element, String firstName) {
		// TODO Auto-generated method stub
		element.sendKeys(firstName);
	}
	public static void typeLastName(WebElement element, String lastName) {
		// TODO Auto-generated method stub
		element.sendKeys(lastName);
	}
	public static void typeAddress(WebElement element, String address) {
		element.sendKeys(address);
	}
	public static void enterCardNo(WebElement element, String data) {
		// TODO Auto-generated method stub
		element.sendKeys(data);
	}
	public static void enterCvvNo(WebElement element, String cvv) {
		// TODO Auto-generated method stub
		element.sendKeys(cvv);
	}
	public static void maximize() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	
	public static void sleep(int time) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(time);
	}
	public static String excelSheet(int row, int col) throws IOException 
	{
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\AdAction\\target\\AdActinData.xlsx");
		FileInputStream stream = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet = wb.getSheet("Data");
		XSSFRow row1 = sheet.getRow(row);
		XSSFCell cell = row1.getCell(col);
		int cellType = cell.getCellType();
		if (cellType==0) {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			String data = String.valueOf(l);
			return data;
		}
		else if (cellType==1) {
			String data = cell.getStringCellValue();
			return data;
		}
		else {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat f1 = new SimpleDateFormat("dd-mm-yyyy");
			String data = f1.format(dateCellValue);
			return data;
		}
	}
	public static void orderNo(int row, int col, String orderNum) throws AWTException, IOException 
	{
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\AdAction\\target\\AdActinData.xlsx");
		FileInputStream stream = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet = wb.getSheet("Data");
		XSSFRow row1 = sheet.createRow(row);
		XSSFCell cell = row1.createCell(col);
		cell.setCellValue(orderNum);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}


	public static String attributeMe(WebElement element) {
		// TODO Auto-generated method stub
		String ordernum = element.getAttribute("value");
	return ordernum;
	}
}

