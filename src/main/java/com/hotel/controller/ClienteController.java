package com.hotel.controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hotel.model.ClienteModel;
import com.hotel.repository.IClienteRepository;
import com.hotel.service.ClienteService;
import com.hotel.service.HabitacionService;

import jakarta.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/clientes")

public class ClienteController {

	
	@Autowired
	private IClienteRepository clienteservice;
	
	@GetMapping("/clientes")
	public String listarClientes(Model model) {
		List<ClienteModel> clientes = clienteservice.ObtenerTodos();
		model.addAttribute("clientes", clienteservice.obtenerPorId());
		model.addAttribute("Clientes",clientes);
		
		return "listarclientes";
	}
	
	@GetMapping("/{clienteId}")
    public String Cliente(@PathVariable Integer clienteId, Model model) {
        ClienteService habitacion = clienteService.obtenerPorId(clienteId);
        model.addAttribute("cliente", clienteId);
        return "cliente";

}
}


