package BT_OOP1;

import java.util.ArrayList;
import java.util.List;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("Nguyễn Văn A", "001", 30, "Hà Nội");
        System.out.println("Thông tin nhân viên");
        System.out.println(nhanVien.getName() + ": " + nhanVien.getId() + ", " + nhanVien.getAge() + ", " + nhanVien.getAddress());

        //Cập nhật thông tin
        System.out.println("Cập nhật thông tin nhân viên");
        nhanVien.setId("001NV");
        nhanVien.setAddress("Hồ Chí Minh");
        System.out.println(nhanVien.getName() + ": " + nhanVien.getId() + ", " + nhanVien.getAge() + ", " + nhanVien.getAddress());

    }
}
