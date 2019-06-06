package com.javagda25.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class MainZad5 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate date1 = LocalDate.of(1980, 12, 12);
        LocalDate date2 = LocalDate.now();

        LocalDateTime ldt1 = LocalDateTime.of(1980, 12, 11, 11, 11);
        LocalDateTime ldt2 = LocalDateTime.now();

        Period period = Period.between(date1, date2);

        Duration duration = Duration.between(ldt1, ldt2);

        System.out.println("wiek period (lata, miesiące): " + period.getYears() + " lat " + period.getMonths() + " miesięcy");

        System.out.println("wiek duration (sekundy): " + duration.getSeconds() + " sekund");

    }
}
