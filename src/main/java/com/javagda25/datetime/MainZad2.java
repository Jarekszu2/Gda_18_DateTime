package com.javagda25.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainZad2 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data_start = LocalDate.of(2019,06, 05);
        System.out.println(data_start);
        LocalDate data_end = LocalDate.of(2019,05, 02);
        System.out.println(data_end);

        Period period = Period.between(data_start, data_end);
        DateTimeFormatter datTimFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // datTimFormat.
        System.out.println("Minęło: " + period.getMonths() + " " + period.getDays());
    }
}
