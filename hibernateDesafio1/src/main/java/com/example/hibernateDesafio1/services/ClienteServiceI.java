package com.example.hibernateDesafio1.services;

import java.util.List;

import com.example.hibernateDesafio1.entities.Cliente;

public interface ClienteServiceI {

	public void insertar(Cliente cliente);
	
	public List<Cliente> getAll();
	
	public Cliente searchById(Long idcliente);
	
	public void deleted(Cliente cliente);

	public void update(Cliente cliente); 
	
}
