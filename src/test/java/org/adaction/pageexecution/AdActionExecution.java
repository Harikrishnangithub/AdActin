package org.adaction.pageexecution;



import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.adaction.pagefactory.AdActionPagefactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class AdActionExecution extends AdActionPagefactory
{
	
public static void main(String[] args) throws InterruptedException, IOException, AWTException 
{
		
	browserlaunch(excelSheet(0, 1),excelSheet(1, 1),excelSheet(2, 1));
	maximize();
	loadurl(excelSheet(0, 0));
	//excelSheet(0, 0);
	AdActionPagefactory pg = new AdActionPagefactory();
	login(pg.getTextLogin(), excelSheet(1, 0));
	password(pg.getTextPassword(), excelSheet(2, 0));
	click(pg.getLoginButton());
	sleep(3000);
	selectLocation();
	selectHotel();
	selectRoom();
	selectNoOfRooms();
	clear(pg.getSelectCheckInDate());
	selectCheckInDate(pg.getSelectCheckInDate(), excelSheet(3, 0));
	clear(pg.getSelectCheckOutDate());
	selectCheckOutDate(pg.getSelectCheckOutDate(), excelSheet(4, 0));
	selectNoOfAdults();
	selectChildRooms();
	click(pg.getClickSearch());
	click(pg.getClickRadioButton());
	click(pg.getClickContinue());
	typeFirstName(pg.getTypeFirstName(), excelSheet(5, 0));
	typeLastName(pg.getTypeLastName(), excelSheet(6, 0));
	typeAddress(pg.getTypeAddress(), excelSheet(7, 0));
	enterCardNo(pg.getEnterCardNo(), excelSheet(8, 0));
	selectCardType();
	selectExpiryMonth();
	selectExpiryYear();
	enterCvvNo(pg.getEnterCvvNo(), excelSheet(9, 0));
	click(pg.getClickBook());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String ordernum = attributeMe(pg.getOrderNo());
	orderNo(10, 0, ordernum);
}
}
