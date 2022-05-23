//Usually, we dont need to handle unchecked exceptions, it is because unchecked exceptions occur due to
// programming error. And, it is good practise to correct them instead of handling them.

//Also we handle checked exceptions using throws and throw
package com.opyjo;

import java.io.*;
class Javathrows {
    public static void findFile() throws IOException {
        // code that may produce IOException
        File newFile=new File("test.txt");
        FileInputStream stream=new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try{
            findFile();
        } catch(IOException e){
            System.out.println(e);
        }
    }
}


