package model;

/**
 * @author Vincent Velthuizen
 *
 * Geef aan of dit object past in een zeker oppervlak
 **/
public interface ToelaatbaarInOppervlak {
    boolean pastInOppervlak(double lengte, double breedte);
}
