/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Center;

import Entity.Account.Account;
import Entity.Account.AccountDirectory;
import Entity.Organization.Organization;
import Entity.Request.RequestDirectory;
import Entity.StrayAnimal.StrayAnimalDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class RescueCenter extends Organization{
    private AccountDirectory manageraccountDir;
    private AccountDirectory employeeaccountDir;
    private StrayAnimalDirectory strayanimalDir;
    private RequestDirectory requestDir;
    
    
    public RescueCenter(){  
        this.manageraccountDir = new AccountDirectory();
        this.employeeaccountDir = new AccountDirectory();
        this.strayanimalDir = new StrayAnimalDirectory();
        this.requestDir = new RequestDirectory();
    }

    public RequestDirectory getRequestDir() {
        return requestDir;
    }

    public void setRequestDir(RequestDirectory requestDir) {
        this.requestDir = requestDir;
    }

    public AccountDirectory getManageraccountDir() {
        return manageraccountDir;
    }

    public void setManageraccountDir(AccountDirectory manageraccountDir) {
        this.manageraccountDir = manageraccountDir;
    }

    public AccountDirectory getEmployeeaccountDir() {
        return employeeaccountDir;
    }

    public void setEmployeeaccountDir(AccountDirectory employeeaccountDir) {
        this.employeeaccountDir = employeeaccountDir;
    }

    public StrayAnimalDirectory getStrayanimalDir() {
        return strayanimalDir;
    }

    public void setStrayanimalDir(StrayAnimalDirectory strayanimalDir) {
        this.strayanimalDir = strayanimalDir;
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
