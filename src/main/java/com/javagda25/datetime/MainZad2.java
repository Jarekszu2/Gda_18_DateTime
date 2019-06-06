package com.javagda25.datetime;

/*
Napisz aplikację, która wyświetli datę sprzed 10 dni i datę za dziesięć dni.
Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.
 */

import java.time.LocalDate;

public class MainZad2 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data = LocalDate.now();
        System.out.println("data: " + data);

        System.out.println();
        LocalDate dataMinus10 = data.minusDays(10);
        System.out.println("data(-10): " + dataMinus10);

        System.out.println();
        LocalDate dataPlus10 = data.plusDays(10l);
        System.out.println("data(+10): " + dataPlus10);
    }
}
