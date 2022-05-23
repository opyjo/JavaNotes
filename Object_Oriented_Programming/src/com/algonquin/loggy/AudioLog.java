package com.algonquin.loggy;

import java.util.Date;

public class AudioLog extends Log implements LogInterface {

    private String type;
    private double size;

    public AudioLog(String name, String description, Date date, String type, double size) {
        super(name, description, date);
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean validateType() {
        if (type != null && (type.equalsIgnoreCase(".mp3") || type.equalsIgnoreCase(".mp4")))
            return true;
        return false;
    }

    @Override
    public boolean validateSize() {
        if (size > 0 && size < 199)
            return true;
        return false;
    }


    @Override
    public void create() {
        System.out.println("Audio file created");

    }

    @Override
    public void read() {
        System.out.println("Audio file read successfully");

    }

    @Override
    public void update() {
        System.out.println("Audio file updated successfully");

    }

    @Override
    public void delete() {
        System.out.println("Audio file deleted successfully");

    }

    @Override
    public void triggerAction() {
        System.out.println("The Audio is transcoded and close-captioned");

    }


}

