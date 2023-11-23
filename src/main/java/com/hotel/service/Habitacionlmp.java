package com.hotel.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.model.HabitancionModel;
import com.hotel.repository.IHabitacionRepository;
public class Habitacionlmp implements HabitacionService {

	@Autowired
	private IHabitacionRepository habitacionRepository;
	@Override
	public List<HabitancionModel> obtenerTodos() {
		
		return habitacionRepository.findAll();
	}

	@Override
	public HabitancionModel obtenerPorId(Integer habitacionId) {
	
		return habitacionRepository.findById(habitacionId).orElse(null);
	}

	@Override
	public void guardarHabitacion(HabitancionModel habitancionModelo) {
		habitacionRepository.save(habitancionModelo);
		
	}

	@Override
	public void eliminarhHabitacion(Integer habitacionId) {
	
		habitacionRepository.deleteById(habitacionId);
	}

	@Override
	public HabitacionService ObtenerPorId(Integer habitacionId) {
		// TODO Auto-generated method stub
		return null;
	}
}
