package com.javagda25.datetime;

/*
Napisz aplikację która po odpowiedzi użytkownika na pytania:
   1) Podaj datę urodzenia w formacie: yyyy-MM-dd":
   2) Kobieta, czy mężczyzna (k/m) - mężczyźni żyją średnio o 10 lat krócej
   3) Czy palisz papierosy? y/n   (palący żyją średnio 9 lat i 3 miesiące krócej)
   4) Czy żyjesz w stresie? (jeśli tak, istnieje 10% prawdopodobieństwo, że umrzesz na zawał serca w wieku 60 lat)


Wskazówka dot. ‘prawdopodobieństwa’:

Random generator = new Random();
int losowaLiczba = generator.nextInt(100);
if (losowaLiczba < 10) {
   // 10 %
}

...poda użytkownikowi przybliżoną datę śmierci. Załóż, że "startowa" długość życia to 100 lat. Aplikacja ma podawać datę z        dokładnością do miesiąca. Możesz dodać dodatkowe warunki. Możesz użyc klasy java.time.Period

* Wyświetl na końcu, ile użytkownik stracił czasu na bezsensownym sprawdzaniu daty śmierci
**(+300pkt) Dodaj nowe dodatkowe warunki i randomizuj niektóre wartości
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainZad6 {
    public static void main(String[] args) {
        System.out.println();

        LocalTime localTimeStart = LocalTime.now();

        System.out.println("Program ustala datę śmierci pytającego:");

        System.out.println();
        System.out.println("Podaj datę urodzenia w formacie: yyyy-MM-dd:");
        Scanner scanner = new Scanner(System.in);
        boolean poprawnaData = false;
        String dataRegex = "";
        do {
            try {
                dataRegex = scanner.next("\\d{4}-\\d{2}-\\d{2}$");
                poprawnaData = true;
            } catch (InputMismatchException ime) {
                System.err.println("Zły format!");
                scanner.next();
            }
        } while (!poprawnaData);
        System.out.println("String dataRegex: " + dataRegex);
        DateTimeFormatter datTimFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(dataRegex, datTimFormat);
        System.out.println("LocalDate dataUrodzenia: " + dataUrodzenia);

        System.out.println();
        char plec = 'a';
        do {
            System.out.println();
            System.out.println("Podaj płeć: k/m?");
            plec = scanner.next().charAt(0);
            if (plec != 'k' && plec != 'm') {
                System.out.println("Podaj: k lub m!");
            }
        } while (plec != 'k' && plec != 'm');
        System.out.println("płeć: " + plec);

        System.out.println();
        char palacy = 'a';
        do {
            System.out.println();
            System.out.println("Czy palisz papierosy: y/n?");
            palacy = scanner.next().charAt(0);
            if (palacy != 'y' && palacy != 'n') {
                System.out.println("Podaj y lub n!");
            }
        } while (palacy != 'y' && palacy != 'n');
        System.out.println("palący: " + palacy);

        System.out.println();
        char czyWStresie = 'a';
        do {
            System.out.println("Czy żyjesz w stresie: y/n?");
            czyWStresie = scanner.next().charAt(0);
            if (czyWStresie != 'y' && czyWStresie != 'n'){
                System.out.println("Podaj 'y' lub 'n'!");
            }
        } while (czyWStresie != 'y' && czyWStresie != 'n');
        System.out.println("czy w stresie: " + czyWStresie);

        System.out.println();
        int wyjsciowaDlugoscZyciaWMiesiacach = 100 * 12;

        int dlugoscZyciaPoUwzglednieniuPlci;
        if (plec == 'm') {
            dlugoscZyciaPoUwzglednieniuPlci = (wyjsciowaDlugoscZyciaWMiesiacach - 10 * 12);
        } else {
            dlugoscZyciaPoUwzglednieniuPlci = wyjsciowaDlugoscZyciaWMiesiacach;
        }

        int dlugoscZyciaPoUwzglednieniuPapierosow;
        if (palacy == 'y') {
            dlugoscZyciaPoUwzglednieniuPapierosow = (dlugoscZyciaPoUwzglednieniuPlci - (9 * 12 + 3));
        } else {
            dlugoscZyciaPoUwzglednieniuPapierosow = dlugoscZyciaPoUwzglednieniuPlci;
        }

        int dlugoscZyciaPoStresie;
        if (czyWStresie == 'y') {
            Random random = new Random();
            int losowaLiczba = random.nextInt(100);
            System.out.println("random: " + losowaLiczba);
            if (losowaLiczba < 10) {
                dlugoscZyciaPoStresie = 60 * 12;
            } else {
                dlugoscZyciaPoStresie = dlugoscZyciaPoUwzglednieniuPapierosow;
            }
        } else {
            dlugoscZyciaPoStresie = dlugoscZyciaPoUwzglednieniuPapierosow;
        }

        System.out.println("płeć: " + plec + "; palący/a: " + palacy + "; \ncałkowita długość życia: " + dlugoscZyciaPoStresie + " m-cy");

        System.out.println();
        LocalDate dataAktualna = LocalDate.now();
        System.out.println("LocalDate dataAktualna: " + dataAktualna);

        Period period = Period.between(dataUrodzenia, dataAktualna);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("dotychczasowa długość życia: " + ((((years * 12) + months) * 30) + days) + " dni");

        System.out.println();
        System.out.println("pozostała długość życia: " + ((dlugoscZyciaPoStresie * 30) - ((((years * 12) + months) * 30) + days)) + " dni");

        System.out.println();
        int pozostalaDlugoscZyciaWDniach = ((dlugoscZyciaPoStresie * 30) - ((((years * 12) + months) * 30) + days));
        LocalDate dataOver = dataAktualna.plusDays(pozostalaDlugoscZyciaWDniach);
        System.out.println("data OVER: " + dataOver);

        LocalTime localTimeEnd = LocalTime.now();
        System.out.println(localTimeEnd);
        System.out.println(localTimeStart);
        Duration duration = Duration.between(localTimeStart, localTimeEnd);
        System.out.println("straciłeś: " + duration.getSeconds() + " sekundy na głupoty!");
    }
}
