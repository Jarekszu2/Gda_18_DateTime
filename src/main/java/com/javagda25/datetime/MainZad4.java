package com.javagda25.datetime;

/*
Pobierz od użytkownika dwie daty. Jedna w formacie:
yyyy::MM::dd
oraz druga w formacie:
MM::yyyy::dd
Wypisz wynik różnicy dat w formacie:
Minęło: X lat, Y miesięcy, Z dni.
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MainZad4 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data_start = LocalDate.of(2017,02, 05);
        System.out.println(data_start);
        LocalDate data_end = LocalDate.of(2019,05, 02);
        System.out.println(data_end);
        // data_end.

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String data1 = "2011/12/11";
        LocalDate locDat = LocalDate.parse(data1, dateTimeFormatter);
        System.out.println("data: " + locDat.format(dateTimeFormatter));

        Period period = Period.between(locDat, data_end);

        System.out.println("Okres czasu: " + period.getYears() + " lat " + period.getMonths() + " m-cy " + period.getDays() + " dni");

        System.out.println();
        System.out.println();
        String dat1 = "1979::11::17";
        System.out.println(dat1);
        String dat2 = "12::1988::01";
        System.out.println(dat2);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MM::yyyy::dd");

        // LocalDateTime localDateTime1 = LocalDateTime.parse(dat1, dateTimeFormatter1);
        // LocalDateTime localDateTime2 = LocalDateTime.parse(dat2, dateTimeFormatter2);
//
        // Period period1 = Period.between(localDateTime1.toLocalDate(),localDateTime2.toLocalDate());
        // System.out.println("Minęło: " + period.getYears() + " lat " + period.getMonths() + " m-cy" + period.getDays() + " dni");

        LocalDate localDate1 = null;
        try {
            localDate1 = LocalDate.parse(dat1, dateTimeFormatter1);
            System.out.println(localDate1);
        } catch (DateTimeParseException dtpe) {
            System.out.println("Zły format daty.");
        }

        LocalDate localDate2 = null;
        try {
            localDate2 = LocalDate.parse(dat2, dateTimeFormatter2);
            System.out.println(localDate2);
        } catch (DateTimeParseException dtpe) {
            System.out.println("Zły format daty.");
        }

        Period period1 = Period.between(localDate1, localDate2);
        System.out.println("Minęło: " + period.getYears() + " lat " + period.getMonths() + " m-cy " + period.getDays() + " dni");
    }
}
