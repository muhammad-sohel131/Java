/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_io;

/**
 *
 * @author Sohel
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_IO {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start Typing... ");
        String line = "";
        do{
            try{
                line = reader.readLine();
            }catch(IOException e){
                System.out.println(e);
            }
            System.out.println(">> " + line.toUpperCase());
        }while(!"off".equals(line));
    }
}
