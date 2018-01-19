package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin() {

		LoginPage l = new LoginPage(driver);

		// enter username
		String username = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		l.setUsername(username);

		// enter password
		String password = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
		l.setPassword(password);

		// click on login button
		l.clickLogin();
	}
}
