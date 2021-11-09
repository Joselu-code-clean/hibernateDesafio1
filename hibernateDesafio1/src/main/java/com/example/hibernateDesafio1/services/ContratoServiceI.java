package com.example.hibernateDesafio1.services;

import java.util.List;

import com.example.hibernateDesafio1.entities.Contrato;

public interface ContratoServiceI {
	
	public void insertar(Contrato contrato);
	
	public List<Contrato> gelAll();

	public Contrato searchById(Long idContrato);
	
	public Contrato searchByIdOfClient(Long idContrato);

	public void deleted(Contrato contrato);

	public void update(Contrato contrato);

}
