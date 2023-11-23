package com.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.model.HabitancionModel;
import com.hotel.model.ReservaModel;

@Service
public interface ReservaService{
	
	List<ReservaModel> obtenerTodos();
	ReservaModel obtenerPorId(Integer id);
	void guardarHabitacion(HabitancionModel habitancionModelo);
}
