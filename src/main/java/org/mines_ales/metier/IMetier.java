package org.mines_ales.metier;

/**
 * Created by Ilias on 06/10/2016.
 */
public interface IMetier {
    public double getTemperature(String nomCapteur) throws TemperatureException;
}
