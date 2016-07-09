package org.ipc.synapsis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SynapsisConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SynapsisConfigurationApplication.class, args);
	}
}
