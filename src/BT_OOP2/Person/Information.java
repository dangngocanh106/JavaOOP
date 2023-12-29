package BT_OOP2.Person;

public class Information {

    public void printInfo(Person person) {
        System.out.println("Họ và tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Số điện thoại: " + person.getPhone());
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyễn Văn A", 35, "Nam", "Hà Nội", "0987562834");

        Information information = new Information();
        //Lấy thông tin ban đầu
        System.out.println("THÔNG TIN CÁ NHÂN: ");
        information.printInfo(person);

    }
}
