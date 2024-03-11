package controller;

import model.Punt;
import model.Rechthoek;

import javax.security.sasl.RealmChoiceCallback;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args){

        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
        try (Scanner rechthoekenScanner = new Scanner(new File("resources/Rechthoek.csv"))) {
            while (rechthoekenScanner.hasNextLine()) {
                String[] rechthoekWaarden = rechthoekenScanner.nextLine().split(",");

                double lengte = Double.parseDouble(rechthoekWaarden[0]);
                double breedte = Double.parseDouble(rechthoekWaarden[1]);
                double xCoordinaat = Double.parseDouble(rechthoekWaarden[2]);
                double yCoordinaat = Double.parseDouble(rechthoekWaarden[3]);
                String kleur = rechthoekWaarden[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, new Punt(xCoordinaat, yCoordinaat), kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het bestand is niet gevonden");
        }

        try (PrintWriter printWriter = new PrintWriter("resources/Rechthoeken.txt")) {

            for (Rechthoek rechthoek : rechthoeken) {
                printWriter.println(rechthoek);
                printWriter.println();
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Het bestand kon niet worden aangemaakt.");
        }
    }
}
