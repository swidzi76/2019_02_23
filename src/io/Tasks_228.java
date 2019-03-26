package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tasks_228 {
    public static void main(String[] args) throws IOException {
        // ZADANIE 1
        // * W dowolnym wybranym przez Ciebie katalogu stwórz za pomocą klasy java.io.File
        // dwa podkatalogi i dwa pliki. W każdym z podkatalogów stwórz kolejne dwa podkatalogi i dwa kolejne pliki.
        // Poćwicz operacje na plikach: przenoszenie, usuwanie, wyświetlanie, kopiowanie.
        // zadanie1();
        // ZADANIE 3
        // Napisz kod, który zapisze do pliku Twoje imię i nazwisko.
        zadanie3();


    }
    public static void zadanie3(){
        //creating new file
        System.out.println("---------------------------------");
        Path folder = Paths.get("C:\\io_test");
        Path file = folder.resolve("hello.txt");
        System.out.println("file = " + file);
        System.out.println("file exists = " + Files.exists(file));

        Path parentFile = file.getParent();

        System.out.println("parentFile exists = " + Files.exists(parentFile));
        try {
            Files.createDirectories(parentFile);
            if(!Files.exists(file)){
                Files.createFile(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("parentFile exists = " + Files.exists(parentFile));
        System.out.println("file exists = " + Files.exists(file));

    }

    public static void zadanie1() throws IOException {
        String strDir = "c:\\io_test";
        String strFile1 = "test_1.txt";
        String strFile2 = "test_2.txt";
        String strDir1 = "dir_test1";
        String strDir2 = "dir_test2";

        File file = new File(strDir);
        System.out.println(" czy file istnieje : " + file.exists());
        System.out.println(" czy to katalog : " + file.isDirectory());
        System.out.println(" czy to plik : " + file.isFile());

        String pathDir1_1 = strDir+"\\"+strDir1+"\\"+strDir1;
        file = new File(pathDir1_1);
        file.mkdirs();
        file = new File(pathDir1_1 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir1_1 + "\\" + strFile2);
        file.createNewFile();

        String pathDir1_2 = strDir+"\\"+strDir1+"\\"+strDir2;
        file = new File(pathDir1_2);
        file.mkdirs();
        file = new File(pathDir1_2 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir1_2 + "\\" + strFile2);
        file.createNewFile();

        String pathDir2_1 = strDir+"\\"+strDir2+"\\"+strDir1;
        file = new File(pathDir2_1);
        file.mkdirs();
        file = new File(pathDir2_1 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir2_1 + "\\" + strFile2);
        file.createNewFile();

        String pathDir2_2 = strDir+"\\"+strDir2+"\\"+strDir2;
        file = new File(pathDir2_2);
        file.mkdirs();
        file = new File(pathDir2_2 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir2_2 + "\\" + strFile2);
        file.createNewFile();

        String pathDir1 = strDir+"\\"+strDir1;
        file = new File(pathDir1 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir1 + "\\" + strFile2);
        file.createNewFile();

        String pathDir2 = strDir+"\\"+strDir2;
        file = new File(pathDir2 + "\\" + strFile1);
        file.createNewFile();
        file = new File( pathDir2 + "\\" + strFile2);
        file.createNewFile();

        file = new File(strDir + "\\" + strFile1);
        file.createNewFile();
        file = new File( strDir + "\\" + strFile2);
        file.createNewFile();

        file = new File(pathDir2_2+ "\\" + strFile1);
        file.delete();
        file = new File(pathDir1_2+ "\\" + strFile1);
        file.delete();

        file = new File(pathDir2_2+ "\\" + strFile2);
        String  fileString2 = file.toString();

        // kasownie plików
        deleteFiles( new File(pathDir1));
        deleteFiles( new File(pathDir2));

    }

    private static void deleteFiles(File parentFile) {
        if(parentFile.isDirectory()) {
            for (File file : parentFile.listFiles()) {
                deleteFiles(file);
            }
        }

        boolean deleted = parentFile.delete();
        System.out.printf("file/folder: %s deleted: %s\n", parentFile, deleted);
    }

}
