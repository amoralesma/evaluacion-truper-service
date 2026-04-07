package com.truper.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductoDto {
	
	private String codigo;
	private String descripcion;
	private BigDecimal precio;

}
