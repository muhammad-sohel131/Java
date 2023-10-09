/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_io;

/**
 *
 * @author Sohel
 */
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.io.IOException;
import java.util.stream.Stream;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:/Users/Sohel/Desktop/hello.txt");
        File file = path.toFile();
        System.out.println(file.exists());
        System.out.println(Files.isDirectory(path));
        
        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = attr.creationTime();
        System.out.println("Creation time = " + creationTime);
        
        FileTime lastModifiedTime = attr.lastModifiedTime();
        System.out.println("Last Modified Time = " + lastModifiedTime);
        
        
        long size = attr.size();
        System.out.println("Size = " + size);
        
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("Owner = " + owner);
        
        Path filePath = Path.of("new.txt");
        
        boolean exists = Files.exists(filePath);
        System.out.println("Exists = " + exists);
        if(!exists){
            Path newFile = Files.createFile(filePath);
            System.out.println("file = " + newFile);
        }
        
        File myFile = new File("HelloWorld.java");
        boolean hasFileCreated = myFile.createNewFile();
        System.out.println("File has created = " + hasFileCreated);
        
        Path listPath = Path.of("C:/Users/Sohel/Desktop");
        Stream<Path> list = Files.list(listPath);
        list.forEach(f -> {
            System.out.println(f);
        });
        System.out.println("Using another method");
        
        File workingDirFile = listPath.toFile();
        File[] allFiles = workingDirFile.listFiles();
        
        for(File f : allFiles){
            System.out.println(f.toPath());
        }
    }
}
