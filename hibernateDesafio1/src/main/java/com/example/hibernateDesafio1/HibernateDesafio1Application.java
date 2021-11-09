package com.example.hibernateDesafio1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hibernateDesafio1.entities.Cliente;
import com.example.hibernateDesafio1.entities.ClienteDaoImpl;
import com.example.hibernateDesafio1.services.ClienteServiceImpl;

@SpringBootApplication
public class HibernateDesafio1Application implements CommandLineRunner{

	@Autowired
	private ClienteServiceImpl clienteService;
	
	@Autowired
	private ClienteDaoImpl clienteDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		// CREAMOS LOS CLIENTES
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Jose Luis");
		cliente1.setPrimer_apellido("Del Rio");
		cliente1.setSegundo_apellido("Munoz");
		cliente1.setDocumento_identidad("77744569I");
		Cliente cliente2 = new Cliente();
		cliente2.setNombre("Pepe Luis");
		cliente2.setPrimer_apellido("Del Rio");
		cliente2.setSegundo_apellido("Martin");
		cliente2.setDocumento_identidad("07744544T");
		Cliente cliente3 = new Cliente();
		cliente3.setNombre("German");
		cliente3.setPrimer_apellido("Armendia");
		cliente3.setSegundo_apellido("Baldomero");
		cliente3.setDocumento_identidad("00045789E");
		
		
		// INSERTAMOS LOS CLIENTES
		// clienteDao.insertar(cliente1);
		
		clienteService.insertar(cliente1);
		clienteService.insertar(cliente2);
		clienteService.insertar(cliente3);
		
		// MOSTRAMOS LA LISTA DE LOS CLIENTES
		List<Cliente> listaCliente = clienteService.getAll();
		for (Cliente cliente : listaCliente) {
			System.out.println(cliente.getNombre());
		}
		
		// MODIFICAMOS UN CLIENTE.
		cliente1.setNombre("MARIA");
		clienteService.update(cliente1);
		
	}
	
	

}
