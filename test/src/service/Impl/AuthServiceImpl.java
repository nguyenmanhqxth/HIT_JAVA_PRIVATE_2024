package service.Impl;

import model.Account;
import service.AuthService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    ArrayList<Account> accounts = new ArrayList<>();
    Account currentAcc = null;


    @Override
    public void login(Scanner scanner) {
        System.out.println("Nhap ten tai khoan : ");
        String ten = scanner.nextLine();
        System.out.println("Nhap mat khau : ");
        String pass = scanner.nextLine();
        for(Account account : accounts){
            if(account.getUsername().equals(ten) && account.getPassword().equals(pass)){
                currentAcc = account;
                System.out.println("Dang nhap thanh cong!!!");
            }
        }
        if(currentAcc == null){
            System.out.println("Dang nhap that bai!!!");
        }
    }

    @Override
    public void logout() {
        if(currentAcc == null){
            System.out.println("Khong co tai khoan da dang nhap!!");
        }
        else{
            currentAcc = null;
            System.out.println("Dang xuat thanh cong!!!");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        for(Account account : accounts){
            if(account.getUsername().equals(username) && account.getPassword().equals(oldPassword)){
                account.setPassword(newPassword);
                System.out.println("Thay doi mat khau thanh cong");
            }
            else{
                System.out.println("Dang nhap that bai!!!");
            }
        }
    }
}
