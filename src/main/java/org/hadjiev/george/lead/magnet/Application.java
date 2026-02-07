package org.hadjiev.george.lead.magnet;

import org.hadjiev.george.lead.magnet.properties.AgentProperties;
import org.hadjiev.george.lead.magnet.properties.SiteProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan("org.hadjiev.george.lead.magnet.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
