/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Network;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class NetworkDirectory {
    private List<Network> networkList;

    public NetworkDirectory() {
        this.networkList = new ArrayList<Network>();
    }
    
    public Network createNetwork(){
        Network res = new Network();
        this.networkList.add(res);
        return res;
    }
    
    public Network searchNetwork(String Location){
        for(Network temp: this.networkList){
            if(temp.getLocation().equals(Location)) return temp;
        }
        return null;
    }
    
    public void deleteNetwork(Network deleteItem){
        this.networkList.remove(deleteItem);
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(List<Network> networkList) {
        this.networkList = networkList;
    }
}
