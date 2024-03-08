package controller;

import java.time.LocalDate;

/**
 * @author Vincent Velthuizen
 * Purpose for the class
 **/
public class LocalDateLauncher {

    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        LocalDate beginVan2024 = LocalDate.parse("2024-01-01");
        System.out.println(beginVan2024.getMonthValue());

        LocalDate verjaardag = LocalDate.parse("1988-02-27");
        if (verjaardag.isAfter(vandaag)) {
            System.out.println("Je verjaardag is nog niet geweest");
        } else {
            System.out.println("Je bent nog lang niet jarig");
        }

        LocalDate trouwdag = LocalDate.parse("2022-12-21");
        LocalDate jubileum = trouwdag.plusYears(12).plusMonths(6);
        System.out.println(jubileum);
    }
}
