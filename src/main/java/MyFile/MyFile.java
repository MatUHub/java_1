package MyFile;

import MyTime.MyTime;

import java.io.*;
import java.util.Scanner;

public class MyFile {
    public void CreateFile(){
        try{
            File file = new File("D:\\File.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else System.out.println("File has already been created");

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void WriteFile(){
        File myfile = new File("D:\\File.txt");
        MyTime myTime = new MyTime();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(myfile,true));
            writer.write((myTime.getTime()) + " -> text \n");
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    public void ReadFile(){

        try {
            FileReader reader = new FileReader("D:\\File.txt");
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()){
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
