package Main;

import MyFile.MyFile;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyFile file = new MyFile();
        file.CreateFile();
        while (true) {
            System.out.println("Введите команду:");
            String message = scanner.nextLine().toLowerCase();
            if (message.equals("q")) break;
            switch (message) {
                case "add":
                    System.out.println("Введите запись для сохраниия в файл: ");
                    String messageInFile = scanner.nextLine();
                    file.WriteFile(messageInFile);
                    System.out.println("Запись добавлена в файл");
                    break;
                case "read":
                    file.ReadFile();
                    break;
                case "help":
                    System.out.println("add - добавление записи в файл \n" +
                            "read - чтение записей из файла \n" +
                            "q - вызод из программы ");
                    break;
                default:
                    System.out.println("Команда не распознана, повторите запрос или введите help для " +
                            "уточнения возможных команд");
            }
        }
        System.out.println("программа завершена");
        scanner.close();
    }
}