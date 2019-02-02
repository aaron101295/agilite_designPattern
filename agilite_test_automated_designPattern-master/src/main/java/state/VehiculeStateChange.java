package state;

public interface VehiculeStateChange {

    public void setState(VehiculeState vh);
    public void setVitesse(int vitesse);
    public int getVitesse();
    public VehiculeState getMoteurCouper();
    public VehiculeState getMoteurAllumer();
}
