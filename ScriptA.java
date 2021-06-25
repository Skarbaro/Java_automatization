package homework2;

import homework3.AdminPageDrivers;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;


public class ScriptA {

    public static void main(String[] args) {

        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("ie");
        AdminPageObjects adminPage = new AdminPageObjects(driver);
        AdminPageDrivers loginToAdmin = new AdminPageDrivers();

        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        logger.log("Log in to the Admin Panel");
        loginToAdmin.loginToAdminPanel(driver);

        logger.log("Click employee name dropdown toggle");
        adminPage.employeeNameDropdownToggle().click();

        logger.log("Click logout link");
        adminPage.logoutLink().click();

        logger.log("Close the browser");
        driver.quit();
    }
}
