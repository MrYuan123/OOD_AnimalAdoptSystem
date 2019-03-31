/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Account;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class AccountDirectory {
    private List<Account> AccountList;

    public AccountDirectory() {
        this.AccountList = new ArrayList<Account>();
    }
    public boolean VerifyAccount(String name, String password){
        for (Account temp : AccountList){
            if(temp.getName().equals(name)&& temp.getPassword().equals(password))
                return true;
        }
        return false;
    }
    
    public boolean existAccount(String name){
        for(Account now : this.AccountList){
            if(now.getName().equals(name))
                return true;
        }
        return false;
    }
    
    public Account getAccount(String name){
        for (Account temp : AccountList){
            if(temp.getName().equals(name))
                return temp;
        }
        return null;
    }
    
    public Account createAdminAccount(String name, String password)
    {
        Account account = new Account();
        account.setName(name);
        account.setPassword(password);
        return account;
    }

    public Account createAccount(){
        Account res = new Account();
        this.AccountList.add(res);
        return res;
    }
    
    public void deleteAccount(Account deleteItem){
        this.AccountList.remove(deleteItem);
    }
    
    public List<Account> getAccountList() {
        return AccountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.AccountList = accountList;
    }

    @Override
    public String toString() {
        return "AccountDirectory{" + "accountList=" + AccountList + '}';
    }
}
