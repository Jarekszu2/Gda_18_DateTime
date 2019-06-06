package com.javagda25.datetime;

import java.time.LocalDate;

public class MainZad1 {
    public static void main(String[] args) {
        System.out.println();

        LocalDate data = LocalDate.now();
        System.out.println("data: " + data);
        LocalDate dataMinus10 = data.minusDays(10);
        System.out.println("data -10: " + dataMinus10);
    }
}
