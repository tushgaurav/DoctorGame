package com.tushgaurav.doctor;

public class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Skin Color: " + this.getColor());
        System.out.println("Softness: " + this.getSoftness());
    }

    public void applyMostoriser() {
        int soft = this.getSoftness();
        this.setSoftness(soft++);
        System.out.println("Moustriser applied, skin softness changed from " + soft + " to " + this.getSoftness());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
