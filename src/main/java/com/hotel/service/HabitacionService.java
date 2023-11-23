package com.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.model.HabitancionModel;


@Service
public interface HabitacionService {

	List<HabitancionModel> obtenerTodos();
	HabitancionModel obtenerPorId(Integer id);
	void guardarHabitacion(HabitancionModel habitancionModelo);
	HabitacionService ObtenerPorId(Integer habitacionId);
	void eliminarhHabitacion(Integer habitacionId);
}






