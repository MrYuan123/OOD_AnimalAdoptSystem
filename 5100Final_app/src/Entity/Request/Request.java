/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Request;

import Entity.Adopter.Adopter;
import Entity.StrayAnimal.StrayAnimal;

/**
 *
 * @author leonardyuan
 */
public class Request {
    private StrayAnimal strayanimal;
    private Adopter adopter;

    public Request() {
    }

    public Request(StrayAnimal strayanimal, Adopter adopter) {
        this.strayanimal = strayanimal;
        this.adopter = adopter;
    }
    
    public StrayAnimal getStrayanimal() {
        return strayanimal;
    }

    public void setStrayanimal(StrayAnimal strayanimal) {
        this.strayanimal = strayanimal;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    @Override
    public String toString() {
        return this.adopter.getUserInfo().getEmail();
    }
}
