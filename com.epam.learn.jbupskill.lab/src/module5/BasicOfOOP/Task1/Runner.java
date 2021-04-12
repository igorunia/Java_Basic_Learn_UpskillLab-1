package module5.BasicOfOOP.Task1;

import java.io.IOException;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Runner {
    public static void main(String [] args) throws IOException {

        TextFile textFile = new TextFile(new Directory("D://"), new File("s.txt"));

        System.out.println("Create a text file: ");
        textFile.createTextFile();
        System.out.println("Rename a text file: ");
        textFile.renameTextFile("s1.txt");
        System.out.println("Print a text file: ");
        textFile.printTextFile();
        System.out.println("Add to text file: ");
        textFile.addToTextFile("daaha");
        textFile.addToTextFile("daaha234");
        System.out.println("Delete a text file: ");
        textFile.deleteOfTextFile();
    }


}
