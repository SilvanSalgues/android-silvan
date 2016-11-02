package org.mines_ales.web;

import org.mines_ales.metier.IMetier;
import org.mines_ales.metier.TemperatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ilias on 06/10/2016.
 */


@RestController
public class TemperatureController {
    @Autowired
    private IMetier metier;
    @RequestMapping(value = "/{capteur}", method = RequestMethod.GET)
    public TemperatureReponse getTemperature(@PathVariable("capteur") String nomCapteur)
    {
        TemperatureReponse reponse = new TemperatureReponse();
        // appel à la couche métier, susceptible de lever une exception si capteur inconnu
        reponse.setNomCapteur(nomCapteur);
        try {
            reponse.setTemp( metier.getTemperature( nomCapteur) );
            reponse.setErreur(0);
        } catch ( TemperatureException e){
            reponse.setErreur(1); // => Temp = 0
            reponse.setErrorMessage( e.getMessage() );
        }

        //trace de l'appel dans le serveur
        System.out.println("getTemperature : capteur="+nomCapteur +
                " temp="+reponse.getTemp());
        return reponse;

    }
}
