package com.javagda25.datetime;

/*
Sposób na czas (Java8):
        LocalDateTime czasWjazd = LocalDateTime.now();
        Timestamp tWjazd = Timestamp.valueOf(czasWjazd);
        LocalDateTime czasWyjazd = LocalDateTime.now();
        Timestamp tWyjazd = Timestamp.valueOf(czasWyjazd);
        Long roznicaT = tWyjazd.getTime() - tWjazd.getTime();
 */

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainTimestamp {
    public static void main(String[] args) {
        System.out.println();

        LocalDateTime locDatTimWjazd = LocalDateTime.now();
        System.out.println("LocalDateTime wjazd: " + locDatTimWjazd);
        LocalTime locCzasWjazd = locDatTimWjazd.toLocalTime();
        System.out.println("LocalTime czasWjazd: " + locCzasWjazd);

        System.out.println();
        LocalDateTime locDatTimWyjazd = LocalDateTime.now();
        System.out.println("LocalDateTime wyjazd: " + locDatTimWyjazd);
        LocalTime locCzasWyjazd = locDatTimWyjazd.toLocalTime();
        System.out.println("LocalTime czasWyjazd: " + locCzasWyjazd);

        System.out.println();
        int roznicaNano = locCzasWyjazd.getNano() - locCzasWjazd.getNano();
        System.out.println("różnicaNano: " + roznicaNano);
        int roznicaSekund = locCzasWyjazd.getSecond() - locCzasWjazd.getSecond();
        System.out.println("różnica sekund: " + roznicaSekund);

        System.out.println();
        Timestamp tWjazd = Timestamp.valueOf(locDatTimWjazd);
        System.out.println("Timestamp wjazd: " + tWjazd);
        Timestamp tWyjazd = Timestamp.valueOf(locDatTimWyjazd);
        System.out.println("Timestamp wyjazd: " + tWyjazd);

        System.out.println();
        System.out.println("okres do wjazd: " + tWjazd.getTime());
        System.out.println("okres do wyjazd: " + tWyjazd.getTime());
        long roznicaLong = tWyjazd.getTime() - tWjazd.getTime();
        System.out.println("long różnica: " + roznicaLong);
    }
}
