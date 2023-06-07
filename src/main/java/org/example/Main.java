package org.example;

import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Generic g= new Generic();
        Map<String, String> map=g.compareTextFiles("C:\\Users\\Lenovo\\Desktop\\xml\\src\\main\\java\\org\\example\\New folder\\fake.xml", "C:\\Users\\Lenovo\\Desktop\\xml\\src\\main\\java\\org\\example\\New folder\\xml.xml");
        System.out.println(map);
    }
}