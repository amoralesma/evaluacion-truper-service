package com.truper.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="produtos")
public class ProductoEntity {
	
	
	public ProductoEntity(String codigo, String descripcion, BigDecimal precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productoId;
	private String codigo;
	private String descripcion;
	private BigDecimal precio;
}
