package controller;

import model.Cirkel;
import model.Figuur;
import model.Punt;
import model.Rechthoek;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        ArrayList<Cirkel> cirkels = new ArrayList<>();
        cirkels.add(new Cirkel(3, new Punt(1, 4), "groen"));
        cirkels.add(0, new Cirkel());
        cirkels.add(new Cirkel(6));

        for (int cirkel = 0; cirkel < cirkels.size(); cirkel++) {
            System.out.println(cirkels.get(cirkel));
        }

        for (Cirkel cirkel : cirkels) {
            System.out.println(cirkel);
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println(figuur.vertelOverGrootte());
        System.out.println();
    }
}
