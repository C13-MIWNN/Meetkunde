package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkels = new Cirkel[3];
        mijnCirkels[0] = new Cirkel();
        mijnCirkels[1] = new Cirkel(6);
        mijnCirkels[2] = new Cirkel(3, new Punt(1, 4), "groen");

        for (int i = 0; i < mijnCirkels.length; i++) {
            System.out.println(mijnCirkels[i].geefOmtrek());
            System.out.println(mijnCirkels[i].geefOppervlakte());
            System.out.println();
        }

        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);
        for (int arrayTeller = 0; arrayTeller < mijnRechthoekArray.length;
             arrayTeller++) {
            System.out.println(mijnRechthoekArray[arrayTeller].geefOmtrek());
            System.out.println(mijnRechthoekArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getxCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].getHoekpuntLinksBoven().getyCoordinaat());
            System.out.println(mijnRechthoekArray[arrayTeller].vertelOverGrootte());
        }
    }
}
