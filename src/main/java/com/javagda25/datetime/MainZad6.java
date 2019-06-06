package com.javagda25.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainZad6 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Program ustala datę śmierci pytającego:");

        System.out.println();
        System.out.println("Podaj datę urodzenia w formacie: yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        DateTimeFormatter datTimFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataUrodzenia = LocalDate.parse(data, datTimFormat);
        System.out.println(dataUrodzenia);

        System.out.println();
        System.out.println("Podaj płeć: k/m?");
        char plec = scanner.next().charAt(0);
        System.out.println("płeć: " + plec);

        System.out.println();
        System.out.println("Czy palisz papierosy: y/n?");
        char palacy = scanner.next().charAt(0);
        System.out.println("palący: " + palacy);

        System.out.println();
        System.out.println("Czy żyjesz w stresie: y/n?");
        char czyWStresie = scanner.next().charAt(0);
        System.out.println("czy w stresie: " + czyWStresie);

        System.out.println();
        int wyjsciowaDlugoscZyciaWMiesiacach = 100 * 12;
        int dlugoscZyciaPoUwzglednieniuPlci;
        int dlugoscZyciaPoUwzglednieniuPapierosow;
        int dlugoscZyciaPoStresie;
        if (plec == 'm') {
            dlugoscZyciaPoUwzglednieniuPlci = (wyjsciowaDlugoscZyciaWMiesiacach - 10 * 12);
            if (palacy == 'y') {
                dlugoscZyciaPoUwzglednieniuPapierosow = (dlugoscZyciaPoUwzglednieniuPlci - (9 * 12 + 3));
                if (czyWStresie == 'y') {

                }
            } else {
                dlugoscZyciaPoUwzglednieniuPapierosow = dlugoscZyciaPoUwzglednieniuPlci;
            }
        } else {
            dlugoscZyciaPoUwzglednieniuPlci = wyjsciowaDlugoscZyciaWMiesiacach;
            if (palacy == 'y') {
                dlugoscZyciaPoUwzglednieniuPapierosow = (dlugoscZyciaPoUwzglednieniuPlci - (9 * 12 + 3));
            } else {
                dlugoscZyciaPoUwzglednieniuPapierosow = dlugoscZyciaPoUwzglednieniuPlci;
            }
        }

        System.out.println(dlugoscZyciaPoUwzglednieniuPapierosow);

    }
}
