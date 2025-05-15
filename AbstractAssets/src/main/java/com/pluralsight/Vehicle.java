package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = 2025;
        int age = currentYear - year;
        double value;

        if (age <= 3) {
            value = originalCost * Math.pow(0.97, age);
        } else if (age <= 6) {
            value = originalCost * Math.pow(0.94, age - 3) * Math.pow(0.97, 3);
        } else if (age <= 10) {
            value = originalCost * Math.pow(0.92, age - 6) * Math.pow(0.94, 3) * Math.pow(0.97, 3);
        } else {
            value = 1000.00;
        }

        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        return value;
    }
}
