import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;


        do {
            ShowMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    int n;
                    System.out.println("Nhập số sinh viên cần thêm");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfo();

                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên cần sửa");
                    String rollNo = sc.nextLine();

                    for (Student student : studentList){
                        if(student.getRollNo().equals(rollNo)){
                            student.inputInfo();
                            break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Nhập mã sinh viên cần xoá");
                    rollNo = sc.nextLine();

                    for (Student student : studentList){
                        if(student.getRollNo().equals(rollNo)){
                            studentList.remove(student);
                            break;
                        }
                    }

                    break;
                case 5:
                    System.out.println("Nhập mã sinh viên cần tìm kiếm: ");
                    String rollNoSearch = sc.nextLine();
                    int count =0;
                    for (Student student: studentList) {
                        if (student.getRollNo().equalsIgnoreCase(rollNoSearch)){
                            student.showInfo();
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.println("Không tìm thấy sinh viên");
                    }
                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>(){
                        public int compare(Student o1, Student o2){
                            int cmp = o1.getFullname().compareTo(o2.getFullname());
                            if(cmp >=0){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }
                    break;
                case 7:
                    Collections.sort(studentList, new Comparator<Student>(){
                        public int compare(Student o1, Student o2){
                            return o1.getGpa() >= o2.getGpa()?-1:1;
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                    }

                    break;
                case 8:
                    System.out.println("Kết Thúc!!!");
                    break;
                default:
                    System.out.println("Nhập sai!!!");
                    break;
            }

        }while (choose !=8);


    }
    static void ShowMenu(){
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3. Sửa thông tin sinh viên theo mã sinh viên");
        System.out.println("4. Xoá thông tin sinh viên");
        System.out.println("5. Tìm kiếm sinh viên theo mã sinh viên");
        System.out.println("6. Hiện thị tất cả sinh viên theo tên từ A->Z");
        System.out.println("7. Hiện thị điểm trung bình của sinh viên sắp xếp từ (cao -> thấp)");
        System.out.println("8. Thoát.");
        System.out.println("Chọn");


    }

}
