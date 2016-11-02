package org.mines_ales.metier;

/**
 * Created by Ilias on 06/10/2016.
 */
public class TemperatureException extends RuntimeException {
    public TemperatureException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemperatureException() {
    }

    public TemperatureException(String message) {
        super(message);
    }

    public TemperatureException(Throwable cause) {
        super(cause);
    }
}
