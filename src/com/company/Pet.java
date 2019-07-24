package com.company;

import java.util.Random;

public  abstract class Pet {

    private int age;
    private Color color;
    private Shelter shelter;

    public Pet(int age, Color color, Shelter shelter) {
        this.age = this.generateDefaultAge();
        this.color = color;
        this.shelter = shelter;
    }

    public Pet() {
    }



    private int generateDefaultAge() {
        return new Random().nextInt(100);
    }


    public final String getInfo() {
        return "Питомец {" +
                "возраст=" + getAge() +
                ", приют=" + getShelter().getName() + " " + getShelter().getAddress() +
                ", цвет=" + getColor() +
                "}";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}
