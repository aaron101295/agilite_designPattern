
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import entity.Parking;
import entity.VehiculeContext;
import entity.VoitureEssence;
import org.junit.Assert;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class VoitureInvocationStepDefinition {



    private VoitureEssence voitureEssence;
    private Parking parking;
    private int niveauEssence;
    private String res;



        @Given("^le client consulte son niveau dessence$")
	    public void le_client_consulte_son_niveau_dessence() throws Throwable {

            VoitureEssence voitureEssence =  new VoitureEssence(2, "Mercedes");
            voitureEssence.getNiveauEssence();

	      // this.niveauEssence = voiture.getNiveauEssence();
            //throw new PendingException();
    }

	    @When("^le client passe à la pompe$")
	    public void le_client_passe_à_la_pompe() throws Throwable {

            VoitureEssence voitureEssence =  new VoitureEssence(2, "Mercedes");
            voitureEssence.faireLePlein();
            //throw new PendingException();
	}

	    @Then("^le client a fait le plein$")
	    public void le_client_a_fait_le_plein() throws Throwable {
            {
                VoitureEssence voitureEssence =  new VoitureEssence(2, "Mercedes");
                Assert.assertTrue(voitureEssence.getNiveauEssence() > this.niveauEssence);
            }
            // throw new PendingException();
        }


//    @Given("^le client demande un conseil$")
//    public void le_client_demande_un_conseil() throws Throwable {
//        Voiture voiture =  new Voiture();
//            voiture.getNiveauEssence();
//        //throw new PendingException();
//    }
//
//    @When("^le systeme conseil le client$")
//    public void le_systeme_conseil_le_client() throws Throwable {
//        Voiture voiture =  new Voiture();
//        res = this.voiture.autonomie();
//        //throw new PendingException();
//    }
//
//    @Then("^le client est conseille$")
//    public void le_client_est_conseille() throws Throwable {
//        {
//            if (niveauEssence <= 5)
//                Assert.assertTrue(res == "allez vite faire le plein");
//            else
//                Assert.assertTrue(res == "vous pouvez encore rouler");
//        }
//        // throw new PendingException();
//    }


    @Given("^on verifie que le parking est vide$")
    public void on_verifie_que_le_parking_est_bien_vide() throws Throwable {
        Parking parking = new Parking();
        List<VehiculeContext> vehicules_garer;

        //ici on vérifie que la taille du parking = 0


        //throw new PendingException();
    }

    @When("^on ajoute une voiture au parking$")
    public void on_ajoute_une_voiture_au_parking() throws Throwable {
        Parking parking = new Parking();
        List<VehiculeContext> vehicules_garer;

        //ici on ajoute une voiture avec la méthode add de parking mais je ne comprends pas comme elle fonctionne

        //throw new PendingException();
    }

     @Then("^on verifie qu'il y a bien une voiture presnte dans le parking$")
    public void on_verifie_qu_il_y_a_bien_une_voiture_presnte_dans_le_parking() throws Throwable {
        Parking parking = new Parking();

        //ici on s'assure que la taille du parking est maintenant supérieure à 1
        //    Assert.assertTrue( parking.size() > 0);
        // throw new PendingException();
    }
	}

