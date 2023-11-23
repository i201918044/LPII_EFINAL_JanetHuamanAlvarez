package com.hotel.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotel.model.HabitancionModel;
import com.hotel.model.ReservaModel;
import com.hotel.repository.IReservaRepository;
public class Reservalmp implements ReservaService {

	@Autowired
	private IReservaRepository reservaRepository;
	@Override
	public List<ReservaModel> obtenerTodos() {
		
		return reservaRepository.findAll();
	}

	@Override
	public ReservaModel obtenerPorId(Integer reservaid) {
		return reservaRepository.findById(reservaid).orElse(null);
	}

	@Override
	public void guardarReserva(ReservaModel reserva ) {
		
	}

}
