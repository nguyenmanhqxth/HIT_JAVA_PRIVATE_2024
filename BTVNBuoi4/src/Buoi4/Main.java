package Buoi4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        books.add(new Book(1, "Sách 1", new TacGia("Tác giả A"), 2222, "Tóm tắt nội dung 1", 100.0));
        books.add(new Book(2, "Sách 2", new TacGia("Tác giả B"), 3333, "Tóm tắt nội dung 2", 150.0));
        books.add(new Book(3, "Sách 3", new TacGia("Tác giả C"), 1111, "Tóm tắt nội dung 3", 200.0));
        books.add(new Book(4, "Sách 4", new TacGia("Tác giả D"), 4444, "Tóm tắt nội dung 4", 250.0));
        books.add(new Book(5, "Sách 5", new TacGia("Tác giả E"), 5555, "Tóm tắt nội dung 5", 300.0));


            System.out.println("Menu:");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. In ra danh sách các cuốn sách");
            System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNewBook(books, sc);
                    break;
                case 2:
                    editBook(books, sc);
                    break;
                case 3:
                    printBooks(books);
                    break;
                case 4:
                    printOldestBook(books);
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }

    }

    // Phương thức thêm sách mới
    public static void addNewBook(ArrayList<Book> books, Scanner sc) {
        System.out.print("Nhập mã sách: ");
        int maSach = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        String tenTacGia = sc.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tóm tắt nội dung: ");
        String tomTatNoiDung = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        double giaTien = sc.nextDouble();

        books.add(new Book(maSach, tenSach, new TacGia( tenTacGia) , namSanXuat, tomTatNoiDung, giaTien));
        System.out.println("Đã thêm sách mới thành công!");
        printBooks(books);
    }

    // Phương thức chỉnh sửa thông tin sách
    public static void editBook(ArrayList<Book> books, Scanner sc) {
        System.out.print("Nhập mã sách cần chỉnh sửa: ");
        int maSach = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {
            if (book.getMaSach() == maSach) {
                System.out.print("Nhập tên sách mới: ");
                book.setTenSach(sc.nextLine());
                System.out.print("Nhập tên tác giả mới: ");
                book.setTg(sc.nextLine());
                System.out.print("Nhập năm sản xuất mới: ");
                book.setNamSanXuat(sc.nextInt());
                sc.nextLine();
                System.out.print("Nhập tóm tắt nội dung mới: ");
                book.setTomTatNoiDung(sc.nextLine());
                System.out.print("Nhập giá tiền mới: ");
                book.setGiaTien(sc.nextDouble());

                System.out.println("Đã cập nhật thông tin sách thành công!");
                printBooks(books);
                return;
            }
        }
        System.out.println("Không tìm thấy sách với mã sách này.");
    }

    // Phương thức in danh sách các cuốn sách
    public static void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            book.display();
        }
    }

    // Phương thức in ra cuốn sách lâu đời cổ kính nhất
    public static void printOldestBook(ArrayList<Book> books) {
        Book oldestBook = books.get(0);
        for (Book book : books) {
            if (book.getNamSanXuat() < oldestBook.getNamSanXuat()) {
                oldestBook = book;
            }
        }
        System.out.println("Cuốn sách lâu đời cổ kính nhất là:");
        oldestBook.display();
    }

}

