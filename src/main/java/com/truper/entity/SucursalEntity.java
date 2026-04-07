package com.truper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="sucursales")
public class SucursalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sucursalId;
	private String nombre;

}
