package org.pursuit.appfromscratch020419.models;

public class Planet {

    private String name;
    private int number;
    private String image;

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setImage(String image){
        this.image = image;
    }

    public String getImage(){
        return image;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
