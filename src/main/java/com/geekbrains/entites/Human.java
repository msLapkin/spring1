package com.geekbrains.entites;

public class Human {
    int id;
    String name;
    String surname;
    int weight;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Human(int id, String name, String surname, int weight) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public Human(){

    }
}
