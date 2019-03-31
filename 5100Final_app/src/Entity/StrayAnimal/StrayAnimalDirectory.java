/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.StrayAnimal;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class StrayAnimalDirectory {
    private ArrayList<StrayAnimal> strayAnimalDirectory;
    
    public StrayAnimalDirectory()
    {
        strayAnimalDirectory = new ArrayList<StrayAnimal>();
    }

    public StrayAnimal createStrayAnimal(){
        StrayAnimal res = new StrayAnimal();
        strayAnimalDirectory.add(res);
        return res;
    }
    
    public StrayAnimal searchStrayAnimal(int id){
        for (StrayAnimal temp : strayAnimalDirectory){
            if(id == temp.getID()) return temp;
        }
        return null;
    }
    
    public void deleteStrayAnimal(StrayAnimal deleteItem){
        this.strayAnimalDirectory.remove(deleteItem);
    }
    
    public ArrayList<StrayAnimal> getStrayAnimalDirectory() {
        return strayAnimalDirectory;
    }
    
    public void addStrayAnimal(StrayAnimal addItem){
        this.strayAnimalDirectory.add(addItem);
    }
}
