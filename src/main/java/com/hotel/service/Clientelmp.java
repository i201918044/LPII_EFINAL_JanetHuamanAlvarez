package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.model.ClienteModel;
import com.hotel.repository.IClienteRepository;
import com.hotel.model.ClienteModel;
import com.hotel.repository.IClienteRepository;

@Service
public class Clientelmp implements ClienteService{

	@Autowired IClienteRepository repositorio;
	@Override
	@Transactional(readOnly = true)
	public List<ClienteModel> ObtenerTodos() {
		List<ClienteModel> cliente = ((ListCrudRepository<ClienteModel,Integer>) ObtenerTodos()).findAll();
		return cliente;
	}

	@Override
	public ClienteModel ObtenerPorId(Integer id) {
		ClienteModel ClientePorId = repositorio.findById(id).orElse(null);
		return ClientePorId;
	}

	@Override
	@Transactional(readOnly = true)
	public void guardarCliente(ClienteModel clientemodel) {
		repositorio.save(clientemodel);
		
	}

}
