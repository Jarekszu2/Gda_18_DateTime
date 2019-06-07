package com.javagda25.datetime;

/*
Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
a. Masz X lat, Y miesięcy, Z dni. (użyj Period)
b. Masz XYZ sekund. (użyj Duration)
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainZad5 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate date1 = LocalDate.of(1980, 12, 12);
        System.out.println("data urodzenia: " + date1);
        LocalDate date2 = LocalDate.now();
        System.out.println("data bieżąca: " + date2);

        System.out.println();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("data bieżąca: " + date2.format(dateTimeFormatter1));
        System.out.println("data bieżąca: " + date2.format(dateTimeFormatter2));
        System.out.println("data bieżąca: " + date2.format(dateTimeFormatter3));

        System.out.println();
        String data = "01/01/2001";
        LocalDate dateString = LocalDate.parse(data, dateTimeFormatter3);
        System.out.println("dataString: " + dateString);
        System.out.println("dataString: " + dateString.format(dateTimeFormatter1));
        System.out.println("dataString: " + dateString.format(dateTimeFormatter2));
        System.out.println("dataString: " + dateString.format(dateTimeFormatter3));

        System.out.println();

        LocalDateTime ldt1 = LocalDateTime.of(1980, 12, 11, 11, 11);
        LocalDateTime ldt2 = LocalDateTime.now();

        Period period = Period.between(date1, date2);

        Duration duration = Duration.between(ldt1, ldt2);

        System.out.println("wiek period (lata, miesiące): " + period.getYears() + " lat " + period.getMonths() + " miesięcy");

        System.out.println("wiek duration (sekundy): " + duration.getSeconds() + " sekund");

    }
}
