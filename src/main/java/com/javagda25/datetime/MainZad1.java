package com.javagda25.datetime;

/*
Stwórz aplikację która w pętli przyjmuje polecenie:
        - wpisanie ‘date’ wypisuje obecny LocalDate
        - wpisanie ‘time’ wypisuje obecny LocalTime
        - wpisanie ‘datetime’ wypisuje obecny LocalDateTime
        (W wybranym przez Ciebie formacie)
    Jeśli użytkownik wpisze 'quit' to zakoncz program.

Daty, podpowiedzi:
Sposób na czas (Java8):
        LocalDateTime czasWjazd = LocalDateTime.now();
        Timestamp tWjazd = Timestamp.valueOf(czasWjazd);
        LocalDateTime czasWyjazd = LocalDateTime.now();
        Timestamp tWyjazd = Timestamp.valueOf(czasWyjazd);
        Long roznicaT = tWyjazd.getTime() - tWjazd.getTime();

Wypisywanie daty w odpowiednim formacie:
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy / MM / dd"); // < - format
        System.out.println(data.format(formatter));

Dostępne znaki dla DateTimeFormatter'a:
https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainZad1 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Program wykonuje zadania związane z datą i czasem.");

        Scanner scanner = new Scanner(System.in);
        char wybor = 'a';
        do {
            System.out.println();
            System.out.println("Wybierz opcję:\na: pokazanie daty\nb: pokazanie czasu\nc: pokazanie dty i czasu\nw: wyjście");
            wybor = scanner.next().charAt(0);

            switch (wybor) {
                case 'a':
                    LocalDate localDate = LocalDate.now();
                    DateTimeFormatter dateTimeFormatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    System.out.println("data: " + localDate.format(dateTimeFormatterDate));
                    break;
                case 'b':
                    LocalTime localTime = LocalTime.now();
                    DateTimeFormatter dateTimeFormatterTime = DateTimeFormatter.ofPattern("HH::mm");
                    System.out.println("czas: " + localTime.format(dateTimeFormatterTime));
                    break;
                case 'c':
                    LocalDateTime localDateTime = LocalDateTime.now();
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH::mm");
                    System.out.println("data i czas: " + localDateTime.format(dateTimeFormatter));
                    break;
                default:
                    if (wybor != 'w') {
                        System.out.println("Wybierz: a, b, c lub w!");
                    }
            }

        } while (wybor != 'w');
    }
}
