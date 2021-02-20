package com.ehc.clientes;

import com.ehc.clientes.model.entity.Cliente;
import com.ehc.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository) {
        return args -> {
            Cliente cliente1 = Cliente.builder().cpf("15622340802").nome("Ezequiel").build();
            Cliente cliente2 = Cliente.builder().cpf("15622340802").nome("Evilyn Campana").build();
            Cliente cliente3 = Cliente.builder().cpf("15622340802").nome("Ruth de Freitas Campana").build();
            Cliente cliente4 = Cliente.builder().cpf("76091869027").nome("Fátima Aparecida Lenhari Camnpana").build();
            Cliente cliente5 = Cliente.builder().cpf("17967485017").nome("Geraldo Campana").build();
            Cliente cliente6 = Cliente.builder().cpf("06782988070").nome("Jessé Campana").build();
            Cliente cliente7 = Cliente.builder().cpf("67405316093").nome("Sara Isabel Campana").build();
            repository.save(cliente1);
            repository.save(cliente2);
            repository.save(cliente3);
            repository.save(cliente4);
            repository.save(cliente5);
            repository.save(cliente6);
            repository.save(cliente7);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
