package BT_OOP3.common;

public class BaseTest {

    public void createDriver() {
        //Hiển thị thông tin Browser, Headless, Report
        Constants.browser = "Chrome";
        Constants.report = true;
        Constants.headless = false;
        System.out.println("Open browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver() {
        System.out.println("Close browser: " + Constants.browser);
    }

}
