package com.anita.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosOrtega {
    
    @Bean
    Persona ejecutarGracia(){
        return new CuentaChistes();
    }
}
