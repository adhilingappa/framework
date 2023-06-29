package trello.endtoend;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.trello.qsp.Utility.BaseClass;
import com.trello.qsp.pomrepository.BoardsPage;
import com.trello.qsp.pomrepository.ToLogin;
import com.trello.qsp.pomrepository.ToLogout;
import com.trello.qsp.pomrepository.WelcomePage;

public class TrelloCreateBoard extends BaseClass {
	@Test
	public void createAndDeleteBoard() throws Throwable {
		ToLogin toLogin = new ToLogin(driver);
		toLogin.getLoginOption().click();
		toLogin.getEmailTextFeild().sendKeys(fileutils.readcommondata("username"));
		toLogin.getContinueSubmitButton().submit();
		webDriverUtils.elementVisible(driver, toLogin.getPasswordTextFeild())
				.sendKeys(fileutils.readcommondata("password"));
		toLogin.getLoginSubmitButton().submit();
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getCreateNewBoardOption().click();
		welcomePage.getBoardTitleTextFeild().sendKeys(fileutils.readcommondata("boardName"));
		webDriverUtils.elementClickble(driver, welcomePage.getCreateSubmitButton()).click();
		BoardsPage boardPage = new BoardsPage(driver);
		boardPage.getUserMenuOption().click();
		boardPage.getMoreOption().click();
		boardPage.getCloseBoardOption().click();
		boardPage.getCloseButton().click();
		boardPage.getPermenantlyDeleteBoardOption().click();
		boardPage.getDeleteBoardButton().click();
		ToLogout toLogout = new ToLogout(driver);
		toLogout.getProfileMenuOption().click();
		toLogout.getLogoutOption().click();
		toLogout.getLogoutSubmitButton().submit();

	}

	@Test
	public void dragAndDrop() throws Throwable {
		ToLogin toLogin = new ToLogin(driver);
		toLogin.getLoginOption().click();
		toLogin.getEmailTextFeild().sendKeys(fileutils.readcommondata("username"));
		toLogin.getContinueSubmitButton().submit();
		webDriverUtils.elementClickble(driver, toLogin.getPasswordTextFeild())
				.sendKeys(fileutils.readcommondata("password"));
		toLogin.getLoginSubmitButton().submit();
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNavigationMenuCreateButton().click();
		welcomePage.getMenuCreateBoard().click();
		welcomePage.getBoardTitleTextFeild().sendKeys(fileutils.readcommondata("boardName"));
		webDriverUtils.elementClickble(driver, welcomePage.getCreateSubmitButton()).click();
		BoardsPage boardPage = new BoardsPage(driver);
		boardPage.getLitleTextFeild().sendKeys("Good");
		boardPage.getAddListSubmitButton().submit();
		boardPage.getLitleTextFeild().sendKeys("Bad");
		boardPage.getAddListSubmitButton().submit();
		Actions actions = new Actions(driver);
		// actions.dragAndDrop(ThroughNavigationMenu.getListOne(),
		// ThroughNavigationMenu.getListTwo()).perform();
		actions.clickAndHold(boardPage.getListOne()).pause(2000).release(boardPage.getListTwo()).perform();
		boardPage.getUserMenuOption().click();
		boardPage.getMoreOption().click();
		boardPage.getCloseBoardOption().click();
		boardPage.getCloseButton().click();
		boardPage.getPermenantlyDeleteBoardOption().click();
		boardPage.getDeleteBoardButton().click();
		ToLogout toLogout = new ToLogout(driver);
		toLogout.getProfileMenuOption().click();
		toLogout.getLogoutOption().click();
		toLogout.getLogoutSubmitButton().submit();

	}

}
