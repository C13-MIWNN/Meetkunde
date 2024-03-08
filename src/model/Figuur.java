package model;

/**
 * @author Vincent Velthuizen
 * Beschrijft algemene eigenschappen die alle figuren gemeen hebben
 **/
public abstract class Figuur {
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

    public abstract double geefOmtrek();

    public abstract double geefOppervlakte();

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
