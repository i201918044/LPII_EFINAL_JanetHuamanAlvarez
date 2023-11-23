package com.hotel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.model.ClienteModel;
import com.hotel.service.ClienteService;


public class CarritoController {
	@Autowired private ClienteService clienteService;

	private List<ClienteModel> carrito = new ArrayList<>();

	@PostMapping("/agregar")
	public String addToChart(@RequestParam("cliente_Id") Integer productoId) {
		ClienteModel producto = clienteService.ObtenerPorId(productoId);
		carrito.add(producto);

		return "redirect:/productos";
	}
}
