package org.mines_ales.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Ilias on 06/10/2016.
 */


@ComponentScan(basePackages = {"org.mines_ales.metier","org.mines_ales.web"})


@EnableAutoConfiguration
public class Config {
    //Auto Configuration
}
