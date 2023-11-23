package com.hotel.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.model.ClienteModel;



@Service
public interface ClienteService {
	List<ClienteModel> ObtenerTodos();
	ClienteModel ObtenerPorId(Integer id);
	void guardarCliente(ClienteModel clientemodel);
}


