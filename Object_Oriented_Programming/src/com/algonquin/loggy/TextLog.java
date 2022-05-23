package com.algonquin.loggy;

import java.util.Date;

public class TextLog extends Log implements LogInterface{

    private String type;
    private double size;

    public TextLog(String name, String description, Date date, String type, double size) {
        super(name, description, date);
        this.type = type;
        this.size = size;
    }

    public boolean typeValidation() {
        if(type!=null && type.equalsIgnoreCase("text"))
            return true;
        return false;
    }

    @Override
    public boolean sizeValidation() {
        if(size>0 && size<99999)
            return true;
        return false;
    }

    @Override
    public void create() {
        System.out.println("Creating a file");

    }

    @Override
    public void read() {
        System.out.println("Reading a file");

    }

    @Override
    public void update() {
        System.out.println("updating a file");

    }

    @Override
    public void delete() {
        System.out.println("Deleting a file");

    }

    @Override
    public void triggerAction() {
        System.out.println("The text is translated");

    }

}
