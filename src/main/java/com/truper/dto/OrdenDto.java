package com.truper.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrdenDto {

	private Date fecha;
	private BigDecimal total;
	
	private List<ProductoDto> productos;
	private SucursalDto sucursal;
}
