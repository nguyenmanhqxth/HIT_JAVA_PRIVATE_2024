package service.Impl;

import model.Account;
import model.Status;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {


    ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public List<ArrayList<Account>> getAllAccount() {
        return List.of(accounts);
    }

    @Override
    public void createNewAccount(Account account) {
         accounts.add(account);
         System.out.println("Tao thanh cong!!!");
    }

    @Override
    public Account getAccountByUsername(String username) {
        for(Account account : accounts){
            if(account.getUsername().equals(username)){
                return account;
            }
        }
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        for(Account account : accounts){
            if(account.getUsername().equals(username)){
                accounts.remove(username);
                System.out.println("Da xoa thanh cong!!!");
            }
        }
    }

    @Override
    public void changeStatus(String username, Status status) {
        for(Account account : accounts){
            if(account.getUsername().equals(username)){
                account.setStatus(status);
            }
        }
    }
}
