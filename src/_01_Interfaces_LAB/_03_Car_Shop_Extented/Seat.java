package _01_Interfaces_LAB._03_Car_Shop_Extented;

import java.io.Serializable;

public class Seat implements Sellable,Car,Serializable {
    private String model;
    private String color;
    private int horsePower;
    private String countryProducer;
    private double price;

    Seat(String model, String color, Integer horsePower, String countryProducer, Double price) {
        this.setModel(model);
        this.setColor(color);
        this.setHorsePower(horsePower);
        this.setCountryProducer(countryProducer);
        this.setPrice(price);
    }

    public String getCountryProducer(){
        return this.countryProducer;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private void setCountryProducer(String countryProducer) {
        this.countryProducer = countryProducer;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                this.getModel(), this.getCountryProducer(), Car.tires);
    }

    @Override
    public double gerPrice() {
        return this.price;
    }
}
