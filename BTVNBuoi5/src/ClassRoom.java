import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    private static ArrayList<Student> list = new ArrayList<>();

    public void input(Student student) {
        list.add(student);
    }

    public void output() {
        for (Student s : list) {
            s.output();
            System.out.println("----------------");
        }
    }

    public void sortByGpa() {
        list.sort((s1, s2) -> Float.compare(s2.getGpa(), s1.getGpa()));
    }

    public void removeById(int id) {
        list.removeIf(student -> student.getId() == id);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom classRoom = new ClassRoom();

        while (true) {
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Sắp xếp theo GPA");
            System.out.println("4. Xóa sinh viên theo ID");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID (555 để dừng): ");
                    int id = scanner.nextInt();
                    if (id == 555) break;

                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String commune = scanner.nextLine();
                    String district = scanner.nextLine();
                    String city = scanner.nextLine();
                    System.out.print("Nhập tên lớp: ");
                    String nameClass = scanner.nextLine();
                    System.out.print("Nhập GPA: ");
                    float gpa = scanner.nextFloat();

                    Address address = new Address(commune, district, city);
                    Student student = new Student(id, name, age, address, nameClass, gpa);
                    classRoom.input(student);
                    break;

                case 2:
                    classRoom.output();
                    break;

                case 3:
                    classRoom.sortByGpa();
                    System.out.println("Danh sách đã được sắp xếp.");
                    break;

                case 4:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int removeId = scanner.nextInt();
                    classRoom.removeById(removeId);
                    System.out.println("Đã xóa.");
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
