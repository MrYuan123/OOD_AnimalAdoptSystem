/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Adopter;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class AdopterDirectory {
    private ArrayList<Adopter> adopterDirectory;
    
    public AdopterDirectory()
    {
        adopterDirectory = new ArrayList<Adopter>();
    }

    public ArrayList<Adopter> getAdopterDirectory() {
        return adopterDirectory;
    }

    public void setAdopterDirectory(ArrayList<Adopter> adopterDirectory) {
        this.adopterDirectory = adopterDirectory;
    }
    
    public Adopter createAdopter(){
        Adopter res = new Adopter();
        this.adopterDirectory.add(res);
        return res;
    }
    
    public Adopter searchAdopter(String name){
        for (Adopter temp: this.adopterDirectory){
            if(temp.getAccount().getName().equals(name)) return temp;
        }
        return null;
    }
    
    public void deleteAdopter(Adopter deleteItem){
        this.adopterDirectory.remove(deleteItem);
    }
    
}
