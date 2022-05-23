package com.algonquin.loggy;


import java.util.Date;

public class LogMain {

    public static void main(String[] args) {
        //Create a log array to hold various log objects
        Log[] logArr = new Log[4];
        logArr[0] = new TextLog("TextLogFile", "Commands are stored as text", new Date(), "text", 50);
        logArr[1] = new PhotoLog("PhotoLogFile", "Images are stored", new Date(), ".jpg", 999);
        logArr[2] = new VideoLog("VideoLogFile", "Videos are stored", new Date(), ".mp4", 1000);
        logArr[3] = new AudioLog("AudioLogFile", "Audios are stored", new Date(), ".mp3", 850);

        //Loop and call log methods
        for (int i = 0; i < 4; i++) {
            Log tl = null;
            if (logArr[i] instanceof TextLog) {
                tl = (TextLog) logArr[i];
            } else if (logArr[i] instanceof PhotoLog) {
                tl = (PhotoLog) logArr[i];
            } else if (logArr[i] instanceof AudioLog) {
                tl = (AudioLog) logArr[i];
            } else if (logArr[i] instanceof VideoLog) {
                tl = (VideoLog) logArr[i];
            }
            tl.read();
            tl.create();
            tl.update();
            tl.delete();
            tl.triggerAction();
            System.out.println();
        }

    }

}

