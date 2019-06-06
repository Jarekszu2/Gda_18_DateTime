package com.javagda25.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main_DateTimeFormat {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("data i czas niesformatowany: " + dateTime);
        // Zmiana - Mamy datę/czas i chcę ją wypisać w zadanym formacie
        // stwórz formatter o podanym formacie
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String wynik = dateTimeFormatter.format(dateTime);
        System.out.println("data i czas sformatowany: " + wynik);

        // mam tekst który jest (lub nie) w zadanym formacie i chcę go zmienić na obiekt data/czas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dawaj:");
        String linia = scanner.nextLine();

        try {
            LocalDateTime localDateTime = LocalDateTime.parse(linia, dateTimeFormatter);
            System.out.println(localDateTime);
        }catch (DateTimeParseException dtpe){
            System.out.println("Zły format daty");
        }


    }
}
