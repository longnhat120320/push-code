import java.util.Scanner;

public class Person {
     String fullname;
     String gender;
     String birthday;
     String address;

    public Person() {
    }

    public Person(String fullname, String gender, String birthday, String address) {
        this.fullname = fullname;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        fullname = input.nextLine();

        System.out.println("Nhập giới tính: ");
        gender = input.nextLine();

        System.out.println("Nhập ngày sinh: ");
        birthday = input.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = input.nextLine();
    }
    public void showInfo(){
        System.out.print("Họ tên: " + fullname + "; Giới tính: " + gender
                + "; Ngày sinh: " + birthday + "; Địa chỉ: " + address);
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

