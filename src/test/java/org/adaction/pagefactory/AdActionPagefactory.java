package org.adaction.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import adaction.utilies.AdActionBase;

public class AdActionPagefactory extends AdActionBase
{
	 public AdActionPagefactory() {
		// TODO Auto-generated constructor stub
		 org.openqa.selenium.support.PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id = "username")
	private WebElement textLogin;
	
	@FindBy(id = "password")
	private WebElement textPassword;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement newUser;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement selectLocation;
	
	@FindBy(id="hotels")
	private WebElement selectHotel;
	
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	
	@FindBy(id="room_nos")
	private WebElement selectNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement selectCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement slectCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement selectNoOfAdults;
	
	@FindBy(id="child_room")
	private WebElement selectChildRoom;
	
	@FindBy(id="Submit")
	private WebElement clickSearch;
	
	@FindBy(id="radiobutton_0")
	private WebElement clickRadioButton;
	
	@FindBy(id="continue")
	private WebElement clickContinue;
	
	@FindBy(id="first_name")
	private WebElement typeFirstName;
	
	@FindBy(id="last_name")
	private WebElement typeLastName;
	
	@FindBy(id="address")
	private WebElement typeAddress;
	
	@FindBy(id="cc_num")
	private WebElement enterCardNo;
	
	@FindBy(id="cc_type")
	private WebElement selectCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement selectExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement selectExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement enterCvvNo;
	
	@FindBy(id="book_now")
	private WebElement clickBook;
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getTextLogin() {
		// TODO Auto-generated method stub
		return textLogin;
	}

	public WebElement getTextPassword() {
		// TODO Auto-generated method stub
		return textPassword;
	}

	public WebElement getLoginButton() {
		// TODO Auto-generated method stub
		return loginButton;
	}

	public WebElement getNewUser() {
		// TODO Auto-generated method stub
		return newUser;
	}

	public WebElement getSelectLocation() {
		// TODO Auto-generated method stub
		return selectLocation;
	}

	public WebElement getSelectHotel() {
		// TODO Auto-generated method stub
		return selectHotel;
	}

	public WebElement getSelectRoomType() {
		// TODO Auto-generated method stub
		return selectRoomType;
		
	}

	public WebElement getSelectNoOfRooms() {
		// TODO Auto-generated method stub
		return selectNoOfRooms;
	}

	public WebElement getSelectCheckInDate() {
		// TODO Auto-generated method stub
		return selectCheckInDate;
	}

	public WebElement getSelectCheckOutDate() {
		// TODO Auto-generated method stub
		return slectCheckOutDate;
		
	}

	public WebElement getSelectNoOfAdults() {
		// TODO Auto-generated method stub
		return selectNoOfAdults;
	}

	public WebElement getSelectChildRoom() {
		// TODO Auto-generated method stub
		return selectChildRoom;
	}

	public WebElement getClickSearch() {
		// TODO Auto-generated method stub
		return clickSearch;
	}

	public WebElement getClickRadioButton() {
		// TODO Auto-generated method stub
		return clickRadioButton;
	}

	public WebElement getClickContinue() {
		// TODO Auto-generated method stub
		return clickContinue;
	}

	public WebElement getTypeFirstName() {
		// TODO Auto-generated method stub
		return typeFirstName;
	}

	public WebElement getTypeLastName() {
		// TODO Auto-generated method stub
		return typeLastName;
	}

	public WebElement getTypeAddress() {
		// TODO Auto-generated method stub
		return typeAddress;
	}

	public WebElement getEnterCardNo() {
		// TODO Auto-generated method stub
		return enterCardNo;
	}

	public WebElement getSelectCardType() {
		// TODO Auto-generated method stub
		return selectCardType;
	}

	public WebElement getSelectExpiryMonth() {
		// TODO Auto-generated method stub
		return selectExpiryMonth;
	}

	public WebElement getSelectExpiryDate() {
		// TODO Auto-generated method stub
		return selectExpiryYear;
	}

	public WebElement getEnterCvvNo() {
		// TODO Auto-generated method stub
		return enterCvvNo;
	}

	public WebElement getClickBook() {
		// TODO Auto-generated method stub
		return clickBook;
	}

	public WebElement getOrderNo() {
		// TODO Auto-generated method stub
		return orderNo;
	}


	
	
}
