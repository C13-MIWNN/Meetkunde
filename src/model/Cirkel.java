package model;

/**
 * @author Vincent Velthuizen
 *
 * Beschrijft een cirkel
 **/
public class Cirkel {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;

    private static final int DEFAULT_STRAAL = 1;
    private static final String DEFAULT_KLEUR = "wit";

    private double straal;
    private Punt middelpunt;
    private String kleur;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        setStraal(straal);
        this.middelpunt = middelpunt;
        this.kleur = kleur;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), DEFAULT_KLEUR);
    }

    public Cirkel() {
        this(DEFAULT_STRAAL);
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben";
    }

    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET EERLIJK!!!";
        }
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.err.printf("De straal moet positief zijn. De straal wordt op %d gezet.", DEFAULT_STRAAL);
            this.straal = DEFAULT_STRAAL;
        } else {
            this.straal = straal;
        }
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
