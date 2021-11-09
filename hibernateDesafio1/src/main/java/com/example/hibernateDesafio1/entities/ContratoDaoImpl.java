package com.example.hibernateDesafio1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContratoDaoImpl implements ContratoDaoI{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		session.save(contrato);
		
		session.close();
		
	}

	@Override
	public List<Contrato> gelAll() {
		Session session = entityManager.unwrap(Session.class);
		
		@SuppressWarnings("unchecked")
		List<Contrato> listaContratos = (List<Contrato>) session.createQuery("FROM Contrato").list();
		
		session.close();
		
		return listaContratos;
	}

	@Override
	public Contrato searchById(Long idContrato) {
		Session session = entityManager.unwrap(Session.class);
		
		Contrato contrato = (Contrato) session.createQuery("FROM Contrato WHERE id=" + idContrato);
		
		session.close();
		
		return contrato;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contrato> searchByIdOfClient(Long idCliente) {
		Session session = entityManager.unwrap(Session.class);
		
		List<Contrato> listaContratos = (List<Contrato>) session.createQuery("FROM Contrato WHERE id=" + idCliente).list();
		
		session.close();
		
		return listaContratos;
	}

	@Override
	public void deleted(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		entityManager.remove(entityManager.merge(contrato));
		
		session.close();
		
	}

	@Override
	public void update(Contrato contrato) {
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(contrato);
		
		session.close();
		
	}

}
