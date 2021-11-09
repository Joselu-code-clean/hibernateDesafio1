package com.example.hibernateDesafio1.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernateDesafio1.entities.Contrato;
import com.example.hibernateDesafio1.entities.ContratoDaoI;

@Service
public class ContratoServiceImpl implements ContratoServiceI{

	@Autowired
	private ContratoDaoI contratoDaoI;
	
	@Override
	@Transactional
	public void insertar(Contrato contrato) {
		contratoDaoI.insertar(contrato);
		
	}

	@Override
	public List<Contrato> getAll() {
		return contratoDaoI.gelAll();
	}

	@Override
	public Contrato searchById(Long idContrato) {
		return contratoDaoI.searchById(idContrato);
	}

	@Override
	public List<Contrato> searchByIdOfClient(Long idContrato) {
		return contratoDaoI.searchByIdOfClient(idContrato);
	}

	@Override
	public void deleted(Contrato contrato) {
		contratoDaoI.deleted(contrato);
		
	}

	@Override
	@Transactional
	public void update(Contrato contrato) {
		contratoDaoI.update(contrato);
		
	}

}
