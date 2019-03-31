/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Network;

import Entity.Adopter.AdopterDirectory;
import Entity.Center.RescueCenterDirectory;
import Entity.EnterpriseDirectory.EnterpriseDirectory;
import Entity.Hospital.PetHospitalDirectory;

/**
 *
 * @author leonardyuan
 */
public class Network {
    private String Location;
    private EnterpriseDirectory enterpriseDir;
    

    public Network() {
        this.enterpriseDir = new EnterpriseDirectory();
    }

    public Network(String Location) {
        this.Location = Location;
        this.enterpriseDir = new EnterpriseDirectory();
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }
    
    @Override
    public String toString() {
        return Location;
    }
}
