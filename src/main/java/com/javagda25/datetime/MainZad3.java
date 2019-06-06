package com.javagda25.datetime;

/*
Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
Wskazówka: skorzystaj z klasy Period:
Period period = Period.between(data_start, data_stop);
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainZad3 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data_start = LocalDate.of(2019,03, 05);
        System.out.println("data_start: " + data_start);
        LocalDate data_end = LocalDate.of(2019,05, 02);
        System.out.println("data_end: " + data_end);

        Period period = Period.between(data_start, data_end);
        // DateTimeFormatter datTimFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // datTimFormat.
        System.out.println("Minęło: " + period.getYears() + " lat " + period.getMonths() + " miesięcy " + period.getDays() + " dni");
    }
}
