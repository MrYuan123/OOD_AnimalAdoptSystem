/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Organization;

/**
 *
 * @author leonardyuan
 */
public class Organization {
    private String Name;
    private String Address;

    public Organization() {
    }

    public Organization(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Organization{" + "Name=" + Name + ", Address=" + Address + '}';
    }
}
