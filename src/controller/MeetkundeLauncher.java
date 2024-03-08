package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Figuur[] figuren = new Figuur[3];
        figuren[0] = new Cirkel(2, new Punt(1, 4), "groen");
        figuren[1] = new Cirkel(6);
        figuren[2] = new Rechthoek();

        for (int i = 0; i < figuren.length; i++) {
            toonInformatie(figuren[i]);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
