package org.mines_ales.web;

/**
 * Created by Ilias on 06/10/2016.
 */
public class TemperatureReponse {
    private String nomCapteur; // identifie la réponse
    private int erreur; // 0 si pas d'erreur
    private String errorMessage; // si erreur != 0
    private double temp; // stocke la température du capteur

    // getters et setters

    public int getErreur() {
        return erreur;
    }
    public void setErreur(int erreur) {
        this.erreur = erreur;
    }


    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getNomCapteur() {
        return nomCapteur;
    }
    public void setNomCapteur(String nomCapteur) {
        this.nomCapteur = nomCapteur;
    }

}
