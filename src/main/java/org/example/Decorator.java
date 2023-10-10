package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Decorator {
    /**
     * Метод для отображения даты и текста в файле
     * @param text - текст
     * @return - формат даты и текста
     */
    public static String getFormattedText(String text) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());
        return "[" + formattedDate + "] " + text;
    }
}
