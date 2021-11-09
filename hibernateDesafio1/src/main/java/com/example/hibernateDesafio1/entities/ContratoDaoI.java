package com.example.hibernateDesafio1.entities;

import java.util.List;

public interface ContratoDaoI {
	
	public void insertar(Contrato contrato);
	
	public List<Contrato> gelAll();

	public Contrato searchById(Long idContrato);
	
	public List<Contrato> searchByIdOfClient(Long idContrato);

	public void deleted(Contrato contrato);

	public void update(Contrato contrato);


}
