/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.System;

import Entity.Account.AccountDirectory;
import Entity.Adopter.Adopter;
import Entity.AdopterCenter.AdopterCenter;
import Entity.AdopterCenter.AdopterCenterDirectory;
import Entity.Center.RescueCenter;
import Entity.Center.RescueCenterDirectory;
import Entity.Hospital.PetHospital;
import Entity.Hospital.PetHospitalDirectory;
import Entity.Network.Network;
import Entity.Network.NetworkDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class EcoSystem {
   private static EcoSystem ecoSystem;
   private NetworkDirectory networkDir;
   private AccountDirectory accountDirectory;
   
   
   public static EcoSystem getInstance(){
       if(ecoSystem == null) ecoSystem = new EcoSystem();
       return ecoSystem;
   }
   
    public EcoSystem(){
        this.networkDir = new NetworkDirectory();
        this.accountDirectory = new AccountDirectory();
    }

    public NetworkDirectory getNetworkDir() {
        return networkDir;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }
    
    public boolean newName(String name){
        for(Network nowNetwork : this.networkDir.getNetworkList()){
            RescueCenterDirectory rcd = nowNetwork.getEnterpriseDir().getRescuecenterDir();
            for(RescueCenter nowrc: rcd.getRcd()){
                if(nowrc.getManageraccountDir().existAccount(name) || nowrc.getEmployeeaccountDir().existAccount(name))
                    return false;
            }
            
            PetHospitalDirectory phd = nowNetwork.getEnterpriseDir().getPethospitalDir();
            for(PetHospital nowph : phd.getPetHospitalList()){
                if(nowph.getManageraccountDir().existAccount(name) || nowph.getEmployeeaccountDir().existAccount(name))
                    return false;
            }
            
            AdopterCenterDirectory acd = nowNetwork.getEnterpriseDir().getAdoptercenterDir();
            for(AdopterCenter nowac : acd.getAdopterCenterDir()){
                if(nowac.getManageraccountDir().existAccount(name) || nowac.getEmployeeaccountDir().existAccount(name))
                    return false;
                
                for(Adopter nowa: nowac.getAdopterDir().getAdopterDirectory()){
                    if(nowa.getAccount().getName().equals(name))
                        return false;
                }
            }
        }
        return true;
    }
}
