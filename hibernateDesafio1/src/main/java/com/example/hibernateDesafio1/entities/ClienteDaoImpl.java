package com.example.hibernateDesafio1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteDaoImpl implements ClienteDaoI{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.save(cliente);
		
		session.close();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getAll() {
		Session session = entityManager.unwrap(Session.class);
		
		List<Cliente> listaClientes = (List<Cliente>) session.createQuery("FROM CLIENTE");
		
		session.close();
		
		return listaClientes;
	}

	@Override
	public Cliente searchById(Long idCliente) {
		Session session = entityManager.unwrap(Session.class);
		
		Cliente cliente = (Cliente) session.createQuery("FROM CLIENTE WHERE ID_CLIENTE=" + idCliente);
		
		session.close();
		
		return cliente;
	}

	@Override
	public void deleted(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.delete(cliente);
		
		session.close();
		
	}

	@Override
	public void update(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.update(cliente);;
		
		session.close();
		
	}
	
	

}
