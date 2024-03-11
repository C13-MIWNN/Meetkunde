package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Vincent Velthuizen
 *
 * Dit is een oppervlak waar we figuren op kunnen plakken
 **/
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> figuren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        figuren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuur.pastInOppervlak(lengte, breedte)) {
            figuren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }
    }

    public ArrayList<Figuur> geefFigurenMetGrotereOppervlakte(double grenswaarde) {
        ArrayList<Figuur> groteFiguren = new ArrayList<>();

        for (Figuur figuur : figuren) {
            if (figuur.geefOppervlakte() >= grenswaarde) {
                groteFiguren.add(figuur);
            }
        }

        return groteFiguren;
    }

    @Override
    public String toString() {
        Collections.sort(figuren);

        StringBuilder stringBuilderCirkel = new StringBuilder("Mijn oppervlak bevat:");

        for (Figuur figuur : figuren) {
            stringBuilderCirkel.append("\n\n").append(figuur);
        }

        return stringBuilderCirkel.toString();
    }
}
