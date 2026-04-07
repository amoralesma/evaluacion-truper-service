package com.truper.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ordenes")
public class OrdenEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordenId;
	private Date fecha;
	private BigDecimal total;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sucursales_id")
	private SucursalEntity sucursal;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="productos_id")
	private List<ProductoEntity> productos;

}
