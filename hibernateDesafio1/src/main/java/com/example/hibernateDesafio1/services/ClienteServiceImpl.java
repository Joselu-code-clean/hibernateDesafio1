package com.example.hibernateDesafio1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hibernateDesafio1.entities.Cliente;
import com.example.hibernateDesafio1.entities.ClienteDaoI;

public class ClienteServiceImpl implements ClienteServiceI{

	@Autowired
	private ClienteDaoI clienteDaoI;
	
	@Override
	public void insertar(Cliente cliente) {
		clienteDaoI.insertar(cliente);
		
	}

	@Override
	public List<Cliente> getAll() {
		return clienteDaoI.getAll();
	}

	@Override
	public Cliente searchById(Long idcliente) {
		return clienteDaoI.searchById(idcliente);
	}

	@Override
	public void deleted(Cliente cliente) {
		clienteDaoI.deleted(cliente);
		
	}

	@Override
	public void update(Cliente cliente) {
		clienteDaoI.update(cliente);
	}

}
