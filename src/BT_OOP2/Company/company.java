package BT_OOP2.Company;

import BT_OOP2.Person.Person;

public class company {
    public static void main(String[] args) {

        Person person = new Person("Nguyễn Văn A", 35, "Nam", "Hà Giang", "0987562834");
        System.out.println("Họ và tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());

    }
}
