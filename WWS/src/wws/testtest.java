/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wws;

/**
 *
 * @author bfw
 */

import java.io.*;
import java.nio.charset.Charset;
import java.lang.AssertionError;

public class testtest {

    private static void einlesen(InputStream is) throws IOException  {
        System.out.println("funk lesen");
        int inChar;
        while ((inChar = is.read()) >= 0) {
            System.out.println(inChar);
        }

/*
        try {
            inChar = is.read();
//            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }*/
    }

private static void toStringInputStreamReader(InputStream is) throws IOException {


    
    InputStreamReader isr = new InputStreamReader(is, Charset.forName("UTF-8"));
    char[] buffer = new char[1024];
    StringBuilder stringBuilder = new StringBuilder();
    int length = 0;
    while ((length = isr.read(buffer, 0, buffer.length)) >= 0) {
            System.out.println("funk stream while");
        stringBuilder.append(buffer, 0, length);
        System.out.println("r"+stringBuilder.toString());
    }
    isr.close();

    System.out.println("r"+stringBuilder.toString());
}
    
    public static void main(String[] args) throws IOException {
//        einlesen(System.in);
        toStringInputStreamReader(System.in);

    }    
}