package com.dndspringboot.App2DnDSpringboot.model;

public class Player {

    private int id;
    private String name;
    private String type;
    private int healthPoints;

    //--------------------------------------- CONSTRUCTORS ---------------------------------------
    public Player(){
    }

    //--------------------------------------- GET/SET ---------------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    //--------------------------------------- METHODS ---------------------------------------


    //--------------------------------------- TO STRING ---------------------------------------

    @Override
    public String toString() {
        return "main.java.com.dndspringboot.App2DnDSpringboot.model.Characters{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", healthPoints=" + healthPoints +
                '}';
    }
}
