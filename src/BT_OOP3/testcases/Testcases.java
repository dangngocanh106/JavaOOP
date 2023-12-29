package BT_OOP3.testcases;

import BT_OOP3.common.BaseTest;
import BT_OOP3.common.Constants;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Testcases extends BaseTest {
    public void login() {

        createDriver();

        System.out.println("1. Open URL https://cms.anhtester.com/login");
        System.out.println("2. Nhập email: " + Constants.email);
        System.out.println("3. Nhập password: " + Constants.password);
        System.out.println("4. Click button Login");
        System.out.println("5. Kiểm tra thông tin đăng nhập hợp lệ?");
        System.out.println("6a. Thông báo lỗi nếu thông tin KHÔNG hợp lệ");
        System.out.println("6b. Thông báo kết quả đăng nhập thành công nếu thông tin hợp lệ");

        closeDriver();
        System.out.println("============================");
    }

    public void addCategory(){

        //Tạo driver
        createDriver();
        //Đăng nhập
        System.out.println("1. Open URL https://cms.anhtester.com/login");
        System.out.println("2. Nhập email: " + Constants.email);
        System.out.println("3. Nhập password: " + Constants.password);
        System.out.println("4. Click button Login");
        System.out.println("5. Kiểm tra thông tin đăng nhập hợp lệ?");
        System.out.println("6a. Thông báo lỗi nếu thông tin KHÔNG hợp lệ");
        System.out.println("6b. Thông báo kết quả đăng nhập thành công nếu thông tin hợp lệ");
        //Vào category
        System.out.println("7. Chọn vào menu Products");
        System.out.println("8. Chọn menu Category");
        System.out.println("9. Click button ADD Category");
        System.out.println("10. Nhập thông tin Category");
        System.out.println("11. Click button Lưu thông tin");
        System.out.println("12. Kiểm tra thông tin hợp lệ");
        System.out.println("13. Thông báo kết quả add category");

        //Đóng driver
        closeDriver();
    }

    public static void main(String[] args) {
        Testcases testcases = new Testcases();
        System.out.println("Test case 1: Login");
        testcases.login();
        System.out.println("Test case 2: Add Category");
        testcases.addCategory();
    }

}
