package com.yearup.dealership;
//This class contains the constructor for the vehicle array with getters and setters ready for future use.
public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getOdometer() {
        return odometer;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin:" + vin +
                ", year: " + year +
                ", make: '" + make + '\'' +
                ", model: '" + model + '\'' +
                ",car type: '" + vehicleType + '\'' +
                ", color: '" + color + '\'' +
                ", odometer: " + odometer +
                ", price: " + price +
                '}';
    }
}
