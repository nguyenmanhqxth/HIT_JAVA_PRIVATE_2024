import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.AccountService;
import service.AuthService;
import service.Impl.AccountServiceImpl;
import service.Impl.AuthServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("001","Nguyen Van Manh",19,new Address("aaaa","Thanh Hoa"),"12/12/1212","manhhh","1234", Role.ADMIN, Status.ACTIVE));
        accounts.add(new Account("002","Nguyen Van A",19,new Address("bbb","Ha Noi"),"12/12/1212","aaaaaa","12341234", Role.USER, Status.ACTIVE));

        Account currentAcc = null;
        Account account = new Account();
        AuthService authService = new AuthServiceImpl();
        AccountService accountService = new AccountServiceImpl();
        while(currentAcc == null){
            System.out.println("===Dang nhap===");
            authService.login(scanner);
        }

        if(account.getRole().equals(Role.ADMIN)){
            while(true){
                System.out.println("=====HE THONG QUAN LI TAI KHOAN=====");
                System.out.println("1.Xem danh sach tai khoan");
                System.out.println("2.Tao tai khoan moi");
                System.out.println("3.Tim kiem 1 tai khoan theo username");
                System.out.println("4.Xoa tai khoan");
                System.out.println("5.Thay doi trang thai tai khoan");
                System.out.println("6.Xem thong tin ca nhan");
                System.out.println("0.Dang xuat");
                System.out.println("Nhap lua chon cua ban");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        accountService.getAllAccount();
                        break;
                    case 2:
                        System.out.println("Nhap thong tin tai khoan moi");
                        System.out.println("Nhap id :");
                        String id = scanner.nextLine();
                        System.out.println("Nhap full name :");
                        String fullname = scanner.nextLine();
                        System.out.println("Nhap tuoi : ");
                        int tuoi = scanner.nextInt();
                        System.out.println("Nhap street");
                        String street = scanner.nextLine();
                        System.out.println("Nhap city : ");
                        String city = scanner.nextLine();
                        System.out.println("Nhap ngay sinh : ");
                        String ngaySinh = scanner.nextLine();



                        accountService.createNewAccount();
                }
            }


        }








    }
}