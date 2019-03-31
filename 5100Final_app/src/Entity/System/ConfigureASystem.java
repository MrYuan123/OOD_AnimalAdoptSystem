/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.System;

import Entity.Account.Account;

/**
 *
 * @author kirito
 */
public class ConfigureASystem {
    public static EcoSystem configure()
    {
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        Account a = ecoSystem.getAccountDirectory().createAdminAccount("zhu", "zhu");
        
        return ecoSystem;
    }
}
