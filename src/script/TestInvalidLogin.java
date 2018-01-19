package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestInvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin() {
		LoginPage login = new LoginPage(driver);

		int rowCount=Lib.getRowCount(EXCEL_PATH, "InvalidLogin");
		for (int i = 1; i <rowCount ; i++) {
			String username=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 0);
			String password=Lib.getCellValue(EXCEL_PATH, "InvalidLogin", i, 1);
			login.setUsername(username);
			login.setPassword(password);
			login.clickLogin();
		}
	}
}
