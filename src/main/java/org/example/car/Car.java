package org.example.car;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private int distance;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

        @Override
        public void start()
        {
            System.out.println("The car is started");
        }

        @Override
        public void drive()
        {
            System.out.println("The car is driving for distance " + this.distance + " meters");
        }

        @Override
        public void stop()
        {

        }

        @Override
        public void print()
        {

        }
    }

