package com.algonquin.loggy;

import java.util.Date;

public class VideoLog extends Log implements LogInterface  {

    private String type;
    private double size;

    public VideoLog(String name, String description, Date date, String type, double size) {
        super(name, description, date);
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean typeValidation() {
        if(type!=null && (type.equalsIgnoreCase(".mp4")||type.equalsIgnoreCase(".wmv")))
            return true;
        return false;
    }

    @Override
    public boolean sizeValidation() {
        if(size>0 && size<999)
            return true;
        return false;
    }


    @Override
    public void create() {
        System.out.println("Video file created");

    }

    @Override
    public void read() {
        System.out.println("Video file read successfully");

    }

    @Override
    public void update() {
        System.out.println("Video file updated successfully");

    }

    @Override
    public void delete() {
        System.out.println("Video file deleted successfully");

    }

    @Override
    public void triggerAction() {
        System.out.println("The Video is transcoded and close-captioned");

    }

}
