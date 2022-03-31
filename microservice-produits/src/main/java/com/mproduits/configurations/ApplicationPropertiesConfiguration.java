package com.mproduits.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
@Data
public class ApplicationPropertiesConfiguration {
    private int limitDeProduits;
}
