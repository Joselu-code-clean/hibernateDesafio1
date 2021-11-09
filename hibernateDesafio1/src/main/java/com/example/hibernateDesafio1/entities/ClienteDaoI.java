package com.example.hibernateDesafio1.entities;

import java.util.List;

public interface ClienteDaoI {

	public void insertar(Cliente cliente);
	
	public List<Cliente> getAll();
	
	public Cliente searchById(Long idcliente);
	
	public void deleted(Cliente cliente);

	public void update(Cliente cliente); 
	
}
