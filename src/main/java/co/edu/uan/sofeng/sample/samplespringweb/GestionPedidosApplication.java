package co.edu.uan.sofeng.sample.samplespringweb;

import java.util.Optional;

import javax.transaction.Transactional;

import co.edu.uan.sofeng.sample.samplespringweb.dominio.Cliente;
import co.edu.uan.sofeng.sample.samplespringweb.repositorio.ClienteRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionPedidosApplication {
    
        private static final Logger log = LoggerFactory.getLogger(GestionPedidosApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GestionPedidosApplication.class, args);
	}
        /*
        @Bean
	public CommandLineRunner demo(ClienteRepositorio repository) {
            return (args) -> {
                // save a few customers
		repository.save(new Cliente("Jack"));
		repository.save(new Cliente("Chloe"));
		repository.save(new Cliente("Kim"));
		repository.save(new Cliente("David"));
		repository.save(new Cliente("Michelle"));
                
                // fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Cliente cliente : repository.findAll()) {
                    log.info(cliente.toString());
			}
                    log.info("");

			// fetch an individual customer by ID
		Cliente cliente = repository.findById(1L);
		log.info("cliente found with findById(1L):");
		log.info("--------------------------------");
		log.info(cliente.toString());
		log.info("");

		// fetch customers by last name
		log.info("cliente found with findByLastName('Bauer'):");
		log.info("--------------------------------------------");
		repository.findBynomCliente("Bauer").forEach(bauer -> {
		log.info(bauer.toString());
		});
		// for (Customer bauer : repository.findByLastName("Bauer")) {
		// 	log.info(bauer.toString());
		// }
		log.info("");
		};
	} */           

        
}
