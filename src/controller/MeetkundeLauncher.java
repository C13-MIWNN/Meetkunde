package controller;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Cirkel mijnCirkel = null;

        while (mijnCirkel == null) {
            System.out.print("Geef een straal ");
            try {
                double straal = keyboard.nextDouble();
                mijnCirkel = new Cirkel(straal);
                System.out.println("Het is gelukt...");
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            } catch (InputMismatchException inputMismatchException) {
                keyboard.nextLine();
                System.out.println("Dat was geen komma getal, probeer het opnieuw");
            } finally {
                System.out.println("Je invoer is correct afgehandeld");
            }
        }

        System.out.println("\nHet is gelukt om een cirkel te maken");
        System.out.println(mijnCirkel);
    }
}
