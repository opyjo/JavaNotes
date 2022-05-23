package com.algonquin.loggy;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // The array demonstrates different logs from user and implement the different functionalities.
        Log[] newLogArr = new Log[4];
        newLogArr[0] = new TextLog("TextLogFile", "Log stored as text", new Date(), "text", 45);
        newLogArr[1] = new PhotoLog("PhotoLogFile", "Log Images saved", new Date(), ".jpg", 855);
        newLogArr[2] = new VideoLog("VideoLogFile", "Log videos accepted", new Date(), ".mp4", 1322);
        newLogArr[3] = new AudioLog("AudioLogFile", "Log audios saved", new Date(), ".mp3", 750);

        //Loop and call log methods
        for (int i = 0; i < 4; i++) {
            Log newLog = null;
            if (newLogArr[i] instanceof TextLog) {
                newLog = (TextLog) newLogArr[i];
            } else if (newLogArr[i] instanceof PhotoLog) {
                newLog = (PhotoLog) newLogArr[i];
            } else if (newLogArr[i] instanceof AudioLog) {
                newLog = (AudioLog) newLogArr[i];
            } else if (newLogArr[i] instanceof VideoLog) {
                newLog = (VideoLog) newLogArr[i];
            }
            newLog.read();
            newLog.create();
            newLog.update();
            newLog.delete();
            newLog.triggerAction();
            System.out.println();
        }

    }

}

