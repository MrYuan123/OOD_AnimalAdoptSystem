/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Center;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class RescueCenterDirectory {
    private List<RescueCenter> rcd;

    public RescueCenterDirectory() {
        rcd = new ArrayList<RescueCenter>();
    }
 
    public RescueCenterDirectory(List<RescueCenter> rcd) {
        this.rcd = rcd;
    }
    
    public RescueCenter createRescueCenter(){
       RescueCenter res = new RescueCenter();
       rcd.add(res);
       return res;
    }
    
    public RescueCenter searchRescueCenter(String name){
        for(RescueCenter temp : rcd){
            if(temp.getName().equals(name)) return temp;
        }
        return null;
    } 
    
    public void deleteRescueCenter(RescueCenter deleteItem){
        this.rcd.remove(deleteItem);
    }

    public List<RescueCenter> getRcd() {
        return rcd;
    }

    public void setRcd(List<RescueCenter> rcd) {
        this.rcd = rcd;
    }
    
    @Override
    public String toString() {
        return "Rescue Center";
    }
}
