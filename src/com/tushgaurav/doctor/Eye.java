package com.tushgaurav.doctor;

public class Eye extends Organ{
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }


    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open() {
        this.isOpened = true;
        System.out.println(this.getName() + " is opened.");
    }

    public void close() {
        this.isOpened = false;
        System.out.println(this.getName() + "is closed.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

}
