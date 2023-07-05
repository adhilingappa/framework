package com.trello.qsp.pomrepository;

import javax.swing.text.html.CSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsPage {
	 public WebDriver driver;
	 public BoardsPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//button[@aria-label='Show menu']")
	 private WebElement userMenuOption;
	 
	 @FindBy(xpath = "//a[contains(.,'More')]")
	 private WebElement moreOption;
	 
	 @FindBy(xpath = "//a[contains(.,'Close board')]")
	 private WebElement closeBoardOption;
	 
	 @FindBy(css = "input[value='Close']")
	 private WebElement closeButton;
	 
	 @FindBy(xpath = "//div[.='Permanently delete board']")
	 private WebElement permenantlyDeleteBoardOption;
	 
	 @FindBy(xpath = "//button[text()='Delete']")
	 private WebElement deleteBoardButton;
	 
	 @FindBy(name = "name")
	 private WebElement litleTextFeild;
	  
	 @FindBy(css = "input[value='Add list']")
	 private WebElement addListSubmitButton;
	 
	 @FindBy(xpath = "//textarea[text()='Good']")
     private WebElement listOne;
	 
	 @FindBy(xpath = "//textarea[text()='Bad']")
	 private WebElement listTwo;
	 
	 
	public WebElement getUserMenuOption() {
		return userMenuOption;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getPermenantlyDeleteBoardOption() {
		return permenantlyDeleteBoardOption;
	}

	public WebElement getDeleteBoardButton() {
		return deleteBoardButton;
	}
	 
	public WebElement getLitleTextFeild() {
		return litleTextFeild;
	}

	public WebElement getAddListSubmitButton() {
		return addListSubmitButton;
	}

	public WebElement getListOne() {
		return listOne;
	}

	public WebElement getListTwo() {
		return listTwo;
	}
}
===========================================================================================
  package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.qsp.Utility.webdriverUtility;

public class ToLogin
{
	 public WebDriver driver;
	 public ToLogin(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//a[text()='Get Trello for free']/preceding-sibling::a")
	 private WebElement loginOption;
	 public WebElement getLoginOption()
	 {
		return loginOption;
	 }
	 
	 @FindBy(id = "user")
	 private WebElement emailTextFeild;
		public WebElement getEmailTextFeild()
		{
			return emailTextFeild;
		}
	 
	 @FindBy(id = "login")
	 private WebElement continueSubmitButton;
	 public WebElement getContinueSubmitButton()
	 {
			return continueSubmitButton;
	 }
	 
	 @FindBy(id = "password")
	 private WebElement passwordTextFeild;
	 public WebElement getPasswordTextFeild()
	  {
			return passwordTextFeild;
	  }
	 
	 @FindBy(id = "login-submit")
	 private WebElement loginSubmitButton;
	 public WebElement getLoginSubmitButton()
	 {
		return loginSubmitButton;
	  }
}
====================================================================
  package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToLogout {
	WebDriver driver;
    public ToLogout(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@data-testid='header-member-menu-button']")
    private WebElement profileMenuOption;
    
    @FindBy(xpath = "//button[contains(.,'Log out')]")
    private WebElement logoutOption;
    
    @FindBy(id = "logout-submit")
    private WebElement logoutSubmitButton;
    
	public WebElement getProfileMenuOption() {
		return profileMenuOption;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public WebElement getLogoutSubmitButton() {
		return logoutSubmitButton;
  }
}
===================================================================================
  package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	 public WebDriver driver;
	 public WelcomePage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 @FindBy(xpath = "//li[@data-testid='create-board-tile']")
	 private WebElement createNewBoardOption;
	 
	 @FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	 private WebElement boardTitleTextFeild;
	 
	 @FindBy(xpath = "//button[text()='Create']")
	 private WebElement createSubmitButton;
	 
	 @FindBy(xpath = "//button[@data-testid='header-create-menu-button']")
	 private WebElement navigationMenuCreateButton;
	 
	 @FindBy(xpath = "//button[contains(.,'Create board')]")
	 private WebElement menuCreateBoard;
	 
	 
	public WebElement getCreateNewBoardOption() {
		return createNewBoardOption;
	}

	public WebElement getBoardTitleTextFeild() {
		return boardTitleTextFeild;
	}

	public WebElement getCreateSubmitButton() {
		return createSubmitButton;
	}
	
	public WebElement getNavigationMenuCreateButton() {
		return navigationMenuCreateButton;
	}

	public WebElement getMenuCreateBoard() {
		return menuCreateBoard;
	}
}
