import entity.VoitureElectrique;
import org.junit.Assert;
import org.junit.Test;
import state.VehiculeState;
import state.VehiculeStateChange;

public class VehiculeStateChangeTest {

    @Test
    public void getterSetterVitesse() {
        final int vitesse = 30;
        final VehiculeStateChange vsc = new VehiculeStateChange() {
            @Override
            public void setState(VehiculeState vh) {

            }

            @Override
            public void setVitesse(int vitesse) {
                vitesse = 30;
            }

            @Override
            public int getVitesse() {
                return 30;
            }

            @Override
            public VehiculeState getMoteurCouper() {
                return null;
            }

            @Override
            public VehiculeState getMoteurAllumer() {
                return null;
            }
        };
        Assert.assertEquals(vsc.getVitesse(), vitesse);

    }


}
