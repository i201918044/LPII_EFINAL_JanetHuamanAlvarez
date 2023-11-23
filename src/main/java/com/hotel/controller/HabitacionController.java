package com.hotel.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.repository.IHabitacionRepository;
import com.hotel.model.HabitancionModel;
import com.hotel.service.HabitacionService;
@Controller
@RequestMapping("/habitacion")
public class HabitacionController {

	@Autowired
	private  HabitacionService HabitacionService;
	@GetMapping
    public String listarHabitaciones(Model model) {
        List<HabitancionModel> habitaciones = HabitacionService.obtenerTodos();
        model.addAttribute("habitaciones", habitaciones);
        return "habitacion/listaHabitaciones";
    }

    @GetMapping("/{habitacionId}")
    public String Habitacion(@PathVariable Integer habitacionId, Model model) {
        HabitacionService habitacion = HabitacionService.ObtenerPorId(habitacionId);
        model.addAttribute("habitacion", habitacion);
        return "habitacion";

        
       
    }
}
