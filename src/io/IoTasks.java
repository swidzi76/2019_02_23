package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IoTasks {
    public static void main(String[] args) {
        // na zajęciach
        //exc1();
        // Zadanie 3
        zadanie3();
        // Zadanie 3
        zadanie4();
    }//main

    public static void zadanie4(){
        Path baseFolder = Paths.get("C:\\io_test");

        Path path = baseFolder.resolve("test_zadanie3.txt");
        try(FileReader fileReader = new FileReader(path.toString())) {
            int read;
            while((read = fileReader.read()) != -1) {
                char character = (char) read;
                System.out.print(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void zadanie3(){
        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("base folder = " + baseFolder);
        try {
            if(!Files.exists(baseFolder)){
                Files.createDirectories(baseFolder);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("test_zadanie3.txt");

        try {
            if(!Files.exists(path)){
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Stream<Path> stream = Files.list(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList) {
                System.out.println("path = " + path1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // zapisywanie do pliku
        try (PrintWriter printWriter = new PrintWriter(path.toString())){
            printWriter.println("Jarosław Świdzicki");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

    public static void exc1(){
        Path baseFolder = Paths.get("C:\\io_test");
        System.out.println("base folder = " + baseFolder);
        try {
            if(!Files.exists(baseFolder)){
                Files.createDirectories(baseFolder);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        Path path = baseFolder.resolve("test.txt");

        try {
            if(!Files.exists(path)){
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Stream<Path> stream = Files.list(baseFolder);
            List<Path> pathList = stream.collect(Collectors.toList());
            for (Path path1 : pathList) {
                System.out.println("path = " + path1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // zapisywanie do pliku
        try (FileWriter fileWriter = new FileWriter(path.toString(), true)){
            fileWriter.write("Ala ma kota \n");
            fileWriter.write("Ala ma kota \n");
            fileWriter.write("Ala ma kota \n");
            fileWriter.write("Ala ma kota \n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter printWriter = new PrintWriter(path.toString())){
            printWriter.println("Justyna ma wiewiórkę");
            printWriter.printf("%10s|%10.2f|%10s%n", "Janusz", 10.7755, "Manager");
            printWriter.printf("%10s|%10.2f|%10s%n", "Agnieszka", 14.7755, "Manager");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
