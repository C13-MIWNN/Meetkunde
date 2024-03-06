package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel mijnCirkel = new Cirkel(3, 1, 4, "groen");
        Cirkel mijnTweedeCirkel = new Cirkel(6);
        Cirkel mijnStandaardCirkel = new Cirkel();
        mijnStandaardCirkel.kleur = "paars";

        System.out.println(Cirkel.geefDefinitie());

        System.out.println(mijnCirkel.geefOmtrek());
        System.out.println(mijnCirkel.geefOppervlakte());

        System.out.println(mijnTweedeCirkel.geefOmtrek());
        System.out.println(mijnTweedeCirkel.geefOppervlakte());

        System.out.println(mijnStandaardCirkel.geefOmtrek());
        System.out.println(mijnStandaardCirkel.geefOppervlakte());
    }
}
