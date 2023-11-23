package com.hotel.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hotel.model.ClienteModel;
import com.hotel.service.ClienteService;

@Service

public interface IClienteRepository extends JpaRepository<ClienteModel, Integer> {

	IClienteRepository obtenerPorId();

	List<ClienteModel> ObtenerTodos();

}
