package BaiTap.DemoStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n------- MENU -------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên theo ID");
            System.out.println("3. Xóa sinh viên theo ID");
            System.out.println("4. Tìm sinh viên theo ID");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Hiển thị danh sách sinh viên");
            System.out.println("7. Điểm trung bình của lớp");
            System.out.println("8. Điểm trung bình cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String gender = scanner.nextLine();
                    System.out.println("Nhập số lượng điểm");
                    int numGrade = scanner.nextInt();
                    double[] grades = new double[numGrade];
                    for (int i = 0; i < numGrade; i++) {
                        System.out.println("Nhập điểm thứ " + (i + 1));
                        grades[i] = scanner.nextDouble();
                    }
                    Student student = new Student(name, gender, grades);
                    studentManager.add(student);
                    System.out.println("Đã thêm sinh viên");
                    System.out.println("Thông tin sinh viên sau khi thêm");
                    for (int i = 0; i < studentManager.getSize(); i++) {
                        System.out.println(studentManager.getListStudent()[i]);
                    }
                    break;
                case 2:
                    System.out.println("Nhập id sinh viên cần sửa");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên mới");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giới tính mới");
                    String newGender = scanner.nextLine();
                    System.out.println("Nhập số lượng điểm mới");
                    int newNumGrade = scanner.nextInt();
                    double[] newGrades = new double[newNumGrade];
                    for (int i = 0; i < newNumGrade; i++) {
                        System.out.println("Nhập điểm thứ " + (i + 1));
                        newGrades[i] = scanner.nextDouble();
                    }
                    Student newStudent = new Student(newName, newGender, newGrades);
                    studentManager.edit(newId, newStudent);
                    System.out.println("Đã sửa thông tin sinh viên");
                    System.out.println("Thông tin sinh viên sau khi sửa");
                    for (int i = 0; i < studentManager.getSize(); i++) {
                        System.out.println(studentManager.getListStudent()[i]);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên cần xóa");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.remove(removeId);
                    System.out.println("Đã xóa sinh viên");
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên cần tìm");
                    int findId = scanner.nextInt();
                    Student findStudent = studentManager.findStudentById(findId);
                    if (findStudent != null) {
                        System.out.println(findStudent);
                    } else {
                        System.out.println("Không tìm thấy id sinh viên");
                    }
                    break;
                case 5:
                    System.out.println("Nhập tên sinh viên cần tìm");
                    String findName = scanner.nextLine();
                    for (Student s : studentManager.getStudentByName(findName)) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.out.println("Danh sách sinh viên");
                    for (int i = 0; i < studentManager.getSize(); i++) {
                        System.out.println(studentManager.getListStudent()[i]);
                    }
                    break;
                case 7:
                    System.out.println("Điểm trung bình của lớp " + studentManager.getAvgStudentInClass());
                    break;
                case 8:
                    System.out.println("Sinh viên có điểm trung bình cao nhất " + studentManager.getMaxAvg());
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng chọn lại");
            }
        }
        while (choice != 0);
    }
}
