package controller;

import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Oppervlak oppervlak2 = new Oppervlak(10, 7);
        oppervlak2.voegFiguurToe(new Rechthoek(4, 3, new Punt(0, 7), "rood"));
        oppervlak2.voegFiguurToe(new Cirkel(4, new Punt(1.5, 1.5), "geel"));
        oppervlak2.voegFiguurToe(new Rechthoek(9, 8, new Punt(3, 2), "groen"));
        oppervlak2.voegFiguurToe(new Rechthoek(4, 1, new Punt(5, 7), "oranje"));
        oppervlak2.voegFiguurToe(new Cirkel(2, new Punt(8, 5), "paars"));
        oppervlak2.voegFiguurToe(new Rechthoek(11, 3, new Punt(5, 3), "blauw"));

        for (Figuur figuur : oppervlak2.geefFigurenMetGrotereOppervlakte(1)) {
            if (figuur instanceof Rechthoek) {
                System.out.println("Rechthoek!");
            } else {
                System.out.println("Geen rechthoek :(");
            }
        }

        System.out.println(oppervlak2);
    }
}
