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

    public List<VehiculeContext> vehicules_garer;

    public Parking()
    {
        this.vehicules_garer = new ArrayList<VehiculeContext>();
    }

    public int passerALaPompe()
    {
       return 0;
    }

    public void addVehicule(VehiculeContext v){

            vehicules_garer.add(v);
    }
}
