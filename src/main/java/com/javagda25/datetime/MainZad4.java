package com.javagda25.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MainZad4 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data_start = LocalDate.of(2017,02, 05);
        System.out.println(data_start);
        LocalDate data_end = LocalDate.of(2019,05, 02);
        System.out.println(data_end);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String data1 = "2011/12/11";
        LocalDate locDat = LocalDate.parse(data1, dateTimeFormatter);
        System.out.println("data: " + locDat.format(dateTimeFormatter));

        Period period = Period.between(locDat, data_end);

        System.out.println("Okres czasu: " + period.getYears() + " lat " + period.getMonths() + " m-cy " + period.getDays() + " dni");
    }
}
