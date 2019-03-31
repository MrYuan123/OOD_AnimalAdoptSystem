/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.EnterpriseDirectory;

import Entity.Adopter.AdopterDirectory;
import Entity.AdopterCenter.AdopterCenterDirectory;
import Entity.Center.RescueCenterDirectory;
import Entity.Hospital.PetHospitalDirectory;

/**
 *
 * @author leonardyuan
 */
public class EnterpriseDirectory {
    private AdopterCenterDirectory adoptercenterDir;
    private RescueCenterDirectory rescuecenterDir;
    private PetHospitalDirectory pethospitalDir;

    public EnterpriseDirectory() {
        this.adoptercenterDir = new AdopterCenterDirectory();
        this.pethospitalDir = new PetHospitalDirectory();
        this.rescuecenterDir = new RescueCenterDirectory();
    }

    public AdopterCenterDirectory getAdoptercenterDir() {
        return adoptercenterDir;
    }

    public void setAdoptercenterDir(AdopterCenterDirectory adoptercenterDir) {
        this.adoptercenterDir = adoptercenterDir;
    }

    public RescueCenterDirectory getRescuecenterDir() {
        return rescuecenterDir;
    }

    public void setRescuecenterDir(RescueCenterDirectory rescuecenterDir) {
        this.rescuecenterDir = rescuecenterDir;
    }

    public PetHospitalDirectory getPethospitalDir() {
        return pethospitalDir;
    }

    public void setPethospitalDir(PetHospitalDirectory pethospitalDir) {
        this.pethospitalDir = pethospitalDir;
    }
    
    @Override
    public String toString() {
        return "EnterpriseDirectory{" + "adoptercenterDir=" + adoptercenterDir + ", rescuecenterDir=" + rescuecenterDir + ", pethospitalDir=" + pethospitalDir + '}';
    }
}
