package SeatPal.SeatPal;

import org.testng.annotations.Test;

import com.seatpal.baseclass.BaseClass;
import com.seatpal.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test(priority = 1)
	public void validLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.acceptCookies();
		login.clickAccount();
		login.enterEmail("testuser@example.com"); // valid email
		login.enterPassword("Password123"); // valid password
		login.clickSigninButton();

	}
}