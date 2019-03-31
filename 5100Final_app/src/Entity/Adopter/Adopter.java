/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Adopter;

import Entity.Account.Account;
import Entity.StrayAnimal.StrayAnimal;
import Entity.StrayAnimal.StrayAnimalDirectory;

/**
 *
 * @author dell
 */
public class Adopter {
    private Account account;
    private AdopterInfo userInfo;
    private StrayAnimalDirectory animalDir;
    private String status;

    public Adopter() {
        this.userInfo = new AdopterInfo();
        this.animalDir = new StrayAnimalDirectory();
        this.account = new Account();
        this.status = "Default";
    }
      
    public Adopter(Account account, AdopterInfo userInfo) {
        this.account = account;
        this.userInfo = userInfo;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public AdopterInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(AdopterInfo userInfo) {
        this.userInfo = userInfo;
    }

    public StrayAnimalDirectory getAnimalDir() {
        return animalDir;
    }

    public void setAnimalDir(StrayAnimalDirectory animalDir) {
        this.animalDir = animalDir;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return userInfo.getFirstName() + " " + userInfo.getLastName() ;
    }
}
