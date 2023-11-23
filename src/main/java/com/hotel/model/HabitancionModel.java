package com.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
@Entity
@Table(name="habitaciones")
public class HabitancionModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
    private Integer id ;
    private Integer numero;
    private String tipo ;
    private Double precio ;
    
    public HabitancionModel() {

	}
	public HabitancionModel(Integer iNT, Integer numero, String tipo, Double precio) {
		super();
		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
		this.precio = precio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
    
	
    
    
}
