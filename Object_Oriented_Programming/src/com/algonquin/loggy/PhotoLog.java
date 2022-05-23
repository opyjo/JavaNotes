package com.algonquin.loggy;

import java.util.Date;

public class PhotoLog extends Log implements LogInterface{

    private String type;
    private double size;

    public PhotoLog(String name, String description, Date date, String type, double size) {
        super(name, description, date);
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean typeValidation() {
        if(type!=null && (type.equalsIgnoreCase("jpeg")||type.equalsIgnoreCase("png")))
            return true;
        return false;
    }

    @Override
    public boolean sizeValidation() {
        if(size>0 && size<499)
            return true;
        return false;
    }

    @Override
    public void create() {
        System.out.println("Created Image File");

    }

    @Override
    public void read() {
        System.out.println("Read Imade File");

    }

    @Override
    public void update() {
        System.out.println("Updated Image File");

    }

    @Override
    public void delete() {
        System.out.println("Deleted Image File");

    }

    @Override
    public void triggerAction() {
        System.out.println("The image is annotated");

    }


}
