// The below code writes the main functionality of the code&code Micro-blogging System where all posts are
// automatically annotated with text, voice and video.

package com.algonquin.loggy;


import java.util.Date;

public abstract class Log {

    // The members/variables are private to show the concept of abstraction
    private String name;
    private String description;
    private Date date;
    private int uniqueId;
    private String shortCode;


    public Log(String name, String description, Date date) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    // Log constructor
    public Log() {
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    //Methods of the Log class. Abstraction of what the logs can do
    public abstract void create();
    public abstract void read();
    public abstract void update();
    public abstract void delete();
    public abstract void triggerAction();

}
