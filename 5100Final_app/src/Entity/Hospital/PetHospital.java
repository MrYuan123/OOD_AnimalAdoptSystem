/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Hospital;

import Entity.Account.Account;
import Entity.Account.AccountDirectory;
import Entity.Organization.Organization;
import Entity.StrayAnimal.StrayAnimalDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class PetHospital extends Organization{
    private int capacity;
    private float SuccessRate;
    private AccountDirectory manageraccountDir;
    private AccountDirectory employeeaccountDir;
    private StrayAnimalDirectory strayanimalDir; 

    public PetHospital() {
        manageraccountDir = new AccountDirectory();
        employeeaccountDir = new AccountDirectory();
        this.strayanimalDir = new StrayAnimalDirectory();
    }

    public PetHospital(int capacity, float SuccessRate, String Name, String Address) {
        super(Name, Address);
        this.capacity = capacity;
        this.SuccessRate = SuccessRate;
        manageraccountDir = new AccountDirectory();
        employeeaccountDir = new AccountDirectory();
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getSuccessRate() {
        return SuccessRate;
    }

    public void setSuccessRate(float SuccessRate) {
        this.SuccessRate = SuccessRate;
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
