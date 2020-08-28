package me.aogaga.cardealership.models;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
    private String Make;
    private  String Model;

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
