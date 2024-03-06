package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen
 * Spelen met meetkunde
 **/
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Cirkel[] mijnCirkels = new Cirkel[3];
        mijnCirkels[0] = new Cirkel();
        mijnCirkels[1] = new Cirkel(6);
        mijnCirkels[2] = new Cirkel(3, 1, 4, "groen");

        for (int i = 0; i < mijnCirkels.length; i++) {
            System.out.println(mijnCirkels[i].geefOmtrek());
            System.out.println(mijnCirkels[i].geefOppervlakte());
            System.out.println();
        }
    }
}
