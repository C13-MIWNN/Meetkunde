package model;

import java.util.ArrayList;

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
        if (figuurPastAlsVormInOppervlak(figuur)) {
            figuren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean figuurPastInOppervlak = false;

        if (figuur instanceof Rechthoek) {
            figuurPastInOppervlak = ((Rechthoek) figuur).getLengte() <= lengte
                    && ((Rechthoek) figuur).getBreedte() <= breedte;
        } else if (figuur instanceof Cirkel) {
            figuurPastInOppervlak = ((Cirkel) figuur).getStraal() <= lengte / 2
                    && ((Cirkel) figuur).getStraal() <= breedte / 2;
        }

        return figuurPastInOppervlak;
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
        String returnString = "Mijn oppervlak bevat:";

        for (Figuur figuur : figuren) {
            returnString += "\n\n" + figuur;
        }

        return returnString;
    }
}
