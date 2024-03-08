package model;

/**
 * @author Vincent Velthuizen
 * Beschrijft algemene eigenschappen die alle figuren gemeen hebben
 **/
public class Figuur {
    private static final double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    protected static final String DEFAULT_KLEUR = "darksalmon";

    private String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten.";
    }

    public double geefOmtrek() {
        // TODO eigenlijk is dit niet zo mooi
        return 0;
    }

    public double geefOppervlakte() {
        // TODO eigenlijk is dit niet een goed antwoord...
        return 0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Zij zijn groot en ik ben klein en dat is NIET EERLIJK!!!";
        }
    }

    @Override
    public String toString() {
        return String.format("Kleur: %s\nOmtrek: %.2f\nOppervlakte: %.2f", kleur, geefOmtrek(), geefOppervlakte());
    }
}
