package org.example;

import java.io.FileWriter;
import java.io.IOException;

import static org.example.Decorator.getFormattedText;



public class Writer {
    /**
     * Запись текста в файл
     * @param text - текст для записи
     * @param filepath - файл для записи
     */
    static String text = "Hello, world!";
    static String filePath = "file.txt";

    public static void writer() {
        /**
         * Метод для записи текста в файл с временем записи
         * и выводом ошибки, в случае неудачи.
         */
        try {
            FileWriter writer = new FileWriter(filePath);
            String formattedText = getFormattedText(text);
            writer.write(formattedText);
            writer.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
