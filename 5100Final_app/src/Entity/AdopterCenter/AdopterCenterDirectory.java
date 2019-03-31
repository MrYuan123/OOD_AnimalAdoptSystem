/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.AdopterCenter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class AdopterCenterDirectory {
    private List<AdopterCenter> adopterCenterDir;

    public AdopterCenterDirectory() {
        this.adopterCenterDir = new ArrayList<AdopterCenter>();
    }
    
    public AdopterCenter createAdopterCenter(){
        AdopterCenter res = new AdopterCenter();
        this.adopterCenterDir.add(res);
        return res;
    }
   
    public void deleteAdopterCenter(AdopterCenter deleteItem){
        this.adopterCenterDir.remove(deleteItem);
    }
    
    public AdopterCenter searchAdopterCenter(String name){
        for(AdopterCenter temp : this.adopterCenterDir){
            if(temp.getName().equals(name)) return temp;
        }
        return null;
    }
    
    public List<AdopterCenter> getAdopterCenterDir() {
        return adopterCenterDir;
    }

    public void setAdopterCenterDir(List<AdopterCenter> adopterCenterDir) {
        this.adopterCenterDir = adopterCenterDir;
    }
    
    @Override
    public String toString() {
        return "Adopter Center";
    }
}
