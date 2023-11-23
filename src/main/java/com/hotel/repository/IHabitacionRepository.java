package com.hotel.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hotel.model.ClienteModel;
import com.hotel.model.HabitancionModel;
import com.hotel.service.HabitacionService;
@Service
public interface IHabitacionRepository extends JpaRepository<HabitancionModel, Integer>{

	ClienteModel obtenerPorId();

}