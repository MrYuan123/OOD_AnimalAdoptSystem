/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class PetHospitalDirectory {
    private List<PetHospital> PetHospitalList;

    public PetHospitalDirectory() {
        this.PetHospitalList = new ArrayList<PetHospital>();
    }

    public List<PetHospital> getPetHospitalList() {
        return PetHospitalList;
    }

    public void setPetHospitalList(List<PetHospital> PetHospitalList) {
        this.PetHospitalList = PetHospitalList;
    }
    
    public PetHospital createPetHospital(){
        PetHospital res = new PetHospital();
        this.PetHospitalList.add(res);
        return res;
    }
    
    public PetHospital searchPetHospital(String name){
        for(PetHospital temp: this.PetHospitalList){
            if(temp.getName().equals(name)) return temp;
        }
        return null;
    }
    
    public void deletePetHospital(PetHospital deleteItem){
        this.PetHospitalList.remove(deleteItem);
    }
    
    @Override
    public String toString() {
        return "Pet Hospital";
    }
}
