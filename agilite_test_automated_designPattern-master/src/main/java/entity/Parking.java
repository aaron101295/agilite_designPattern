package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Décrivez votre classe toutTerrain ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Parking
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    public List<VehiculeContext> vehicules_garer;
    /**
     * Constructeur d'objets de classe toutTerrain
     */
    public Parking()
    {
        this.vehicules_garer = new ArrayList<VehiculeContext>();
    }

    /**
     * DesignePattern Observateur a voir avec les autres
     *
     */
    public int passerALaPompe()
    {
       return 0;
    }

    /**
     * Ajoute voiture au parking. design pattern visiteur  ou observateur a voir avec les autres
     */
    public void addVehicule(VehiculeContext v){

            vehicules_garer.add(v);
    }
}
