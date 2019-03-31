/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Adopter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardyuan
 */
public class AdopterInfo {
    private String lastName;
    private String firstName;
    private int age;
    private String email;
    private String phoneNumber;
    private int salary;
    private String addressLine;
    private String targetSpecies;
    private List<String> typeList;

    public AdopterInfo() {
        typeList = new ArrayList<String>();
    }

    public AdopterInfo(String lastName, String firstName, int age, String email, String phoneNumber, int salary, String addressLine, String targetSpecies, List<String> typeList) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.addressLine = addressLine;
        this.targetSpecies = targetSpecies;
        this.typeList = typeList;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getTargetSpecies() {
        return targetSpecies;
    }

    public void setTargetSpecies(String targetSpecies) {
        this.targetSpecies = targetSpecies;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }
    
    public void addType(String type){
        this.typeList.add(type);
    }
    
    public void deleteTyep(String type){
        this.typeList.remove(type);
    }

    @Override
    public String toString() {
        return "AdopterInfo{" + "lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", salary=" + salary + ", addressLine=" + addressLine + ", targetSpecies=" + targetSpecies + ", typeList=" + typeList + '}';
    }
}
