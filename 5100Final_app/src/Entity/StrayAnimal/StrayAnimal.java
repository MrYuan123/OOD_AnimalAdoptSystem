/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.StrayAnimal;


/**
 *
 * @author dell
 */
public class StrayAnimal {
    private int ID;
    private String Species;
    private String Address;
    private String Description;
    private String Status;
    private String traceStatus;
    
    public StrayAnimal(){
        this.traceStatus = "available";
    }

    public StrayAnimal(int ID, String Species, String Address, String Description, String Status) {
        this.ID = ID;
        this.Species = Species;
        this.Address = Address;
        this.Description = Description;
        this.Status = Status;
        this.traceStatus = "available";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTraceStatus() {
        return traceStatus;
    }

    public void setTraceStatus(String traceStatus) {
        this.traceStatus = traceStatus;
    }
    
    @Override
    public String toString() {
        return "" + ID ;
    }
}
