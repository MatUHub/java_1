package MyFile;

import MyTime.MyTime;

import java.io.*;
import java.util.Scanner;

public class MyFile {
    //Место создания файла
    String puthFile = "D:\\File.txt";

    public void CreateFile() {
        try {
            File file = new File(puthFile);
            if (file.createNewFile()) {
                System.out.println("Файл создан в " + puthFile);
            } else System.out.println("Файл уже создан в " + puthFile);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void WriteFile(String messageInFile) {
        File myfile = new File(puthFile);
        MyTime myTime = new MyTime();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myfile, true));
            writer.write((myTime.getTime()) + " -> " + messageInFile + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void ReadFile() {

        try {
            FileReader reader = new FileReader(puthFile);
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
