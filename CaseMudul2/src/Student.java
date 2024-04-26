import java.util.Scanner;

public class Student extends Person{
    String rollNo;
    float gpa;
    String email;

    public Student() {
    }

    public Student(String rollNo, float gpa, String email) {
        this.rollNo = rollNo;
        this.gpa = gpa;
        this.email = email;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("Mã sinh viên: " + rollNo + "; Điểm trung bình: "
                + gpa + "; Email: " + email);
        System.out.println(" ");
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        while (true){
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if(check){
                break;
            }
        }
        System.out.println("Nhập điểm trung bình của sinh viên");
        while (true){
            float gpsInput = Float.parseFloat(input.nextLine());
            boolean check = setGpa(gpsInput);
            if (check){
                break;
            }
        }
        System.out.println("Nhập email sinh viên");
        while (true){
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if(check){
                break;
            }
        }
    }

    // check xem sv nao duoc hoc bong
    public boolean checkScholarship(){
        if (gpa >=8){
            System.out.println(" Sinh viên được học bổng");
            return true;
        }else {
            return false;
        }
    }


    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo !=null && rollNo.length() ==4 ){
            this.rollNo = rollNo;
            return true;
        }else {
            System.err.println("Nhập lại mã sinh viên (có 4 ký tự): ");
            return false;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public boolean setGpa(float gpa) {
        if(gpa >= 0 && gpa <= 10){
            this.gpa = gpa;
            return true;
        }else {
            System.err.println("Nhập lại điểm trung bình ( điểm >=0 hoặc <=10 ): ");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }else {
            System.err.println("Sai cú pháp vui lòng nhập lại Email: ");
            return false;
        }

    }

}
