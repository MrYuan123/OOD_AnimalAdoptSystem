/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.AdopterCenter;

import Entity.Account.AccountDirectory;
import Entity.Adopter.AdopterDirectory;
import Entity.Organization.Organization;
import Entity.Request.RequestDirectory;

/**
 *
 * @author leonardyuan
 */
public class AdopterCenter extends Organization{
    private AdopterDirectory adopterDir;
    private AccountDirectory manageraccountDir;
    private AccountDirectory employeeaccountDir;
    private RequestDirectory requestDir;

    public AdopterCenter() {
        manageraccountDir = new AccountDirectory();
        employeeaccountDir = new AccountDirectory();
        adopterDir = new AdopterDirectory();
        requestDir = new RequestDirectory();
    }

    public RequestDirectory getRequestDir() {
        return requestDir;
    }

    public void setRequestDir(RequestDirectory requestDir) {
        this.requestDir = requestDir;
    }
    
    public AdopterDirectory getAdopterDir() {
        return adopterDir;
    }

    public void setAdopterDir(AdopterDirectory adopterDir) {
        this.adopterDir = adopterDir;
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
    
    @Override
    public String toString() {
        return super.getName();
    }
}
