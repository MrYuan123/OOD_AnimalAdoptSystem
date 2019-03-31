/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Request;

import Entity.Adopter.Adopter;
import Entity.StrayAnimal.StrayAnimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class RequestDirectory {
    private List<Request> requestList;

    public RequestDirectory() {
        this.requestList = new ArrayList<Request>();
    }
    
    public void addRequest(StrayAnimal strayanimal, Adopter adopter){
        requestList.add(new Request(strayanimal,adopter));
    }
    
    public void deleteRequest(Request deleteItem){
        this.requestList.remove(deleteItem);
    }
    
    public Request searchRequest(String adopterName, int animalId){
       for(Request temp: this.requestList){
           if(temp.getAdopter().getAccount().getName().equals(adopterName)&& temp.getStrayanimal().getID() == animalId)
               return temp;
        }
       return null;
    }
    
    public List<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<Request> requestList) {
        this.requestList = requestList;
    }

    @Override
    public String toString() {
        return "RequestDirectory{" + "requestList=" + requestList + '}';
    }
}
