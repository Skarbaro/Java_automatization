package homework2;

import homework3.AdminPageDrivers;
import infrastructure.config.logger.TestLogger;
import infrastructure.config.webdrivermanager.DriverManager;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class ScriptB {

    public static void main(String[] args) throws InterruptedException {

        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("chrome");
        AdminPageObjects adminPage = new AdminPageObjects(driver);
        AdminPageDrivers loginToAdmin = new AdminPageDrivers();

        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        logger.log("Log in to the Admin Panel");
        loginToAdmin.loginToAdminPanel(driver);

        logger.log("Click on 'Dashboard' menu item");
        adminPage.menuItem("Dashboard").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Dashboard • prestashop-automation");

        logger.log("Click on 'Заказы' menu item");
        adminPage.menuItem("Заказы").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Заказы • prestashop-automation");

        logger.log("Click on 'Каталог' menu item");
        adminPage.menuItem("Каталог").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "товары • prestashop-automation");

        logger.log("Click on 'Клиенты' menu item");
        adminPage.menuItem("Клиенты").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Управление клиентами • prestashop-automation");

        logger.log("Click on 'Служба поддержки' menu item");
        adminPage.menuItem("Служба поддержки").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Customer Service • prestashop-automation");

        logger.log("Click on 'Статистика' menu item");
        adminPage.menuItem("Статистика").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Статистика • prestashop-automation");

        logger.log("Click on 'Modules' menu item");
        adminPage.menuItem("Modules").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "prestashop-automation");

        logger.log("Click on 'Design' menu item");
        adminPage.menuItem("Design").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Шаблоны • prestashop-automation");

        logger.log("Click on 'Доставка' menu item");
        adminPage.menuItem("Доставка").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Курьеры • prestashop-automation");

        logger.log("Click on 'Способ оплаты' menu item");
        adminPage.menuItem("Способ оплаты").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Payment Methods • prestashop-automation");

        logger.log("Click on 'International' menu item");
        adminPage.menuItem("International").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Локализация • prestashop-automation");

        logger.log("Click on 'Shop Parameters' menu item");
        adminPage.menuItem("Shop Parameters").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "General • prestashop-automation");

        logger.log("Click on 'Конфигурация' menu item");
        adminPage.menuItem("Конфигурация").click();

        logger.log("Get and print page title");
        adminPage.printTitleText();

        logger.log("Refresh page and check if we on the same page");
        adminPage.refreshPage();
        assertEquals(driver.getTitle(), "Information • prestashop-automation");

        logger.log("Close the browser");
        driver.quit();
    }
}
