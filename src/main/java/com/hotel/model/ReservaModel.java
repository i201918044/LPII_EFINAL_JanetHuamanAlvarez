package com.hotel.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")
public class ReservaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
    private Integer cliente_id;
    private Integer habitacion_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_inicio;
    private Double total;
    private String estado;
    
    
    public ReservaModel() {

	}
	public ReservaModel(Integer id, Integer cliente_id, Integer habitacion_id, Date fecha_inicio, Double total,
			String estado) {
		this.id = id;
		this.cliente_id = cliente_id;
		this.habitacion_id = habitacion_id;
		this.fecha_inicio = fecha_inicio;
		this.total = total;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Integer getHabitacion_id() {
		return habitacion_id;
	}

	public void setHabitacion_id(Integer habitacion_id) {
		this.habitacion_id = habitacion_id;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

    
    
}
