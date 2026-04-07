package com.truper.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.truper.dto.ProductoDto;
import com.truper.entity.ProductoEntity;
import com.truper.exception.ValidationException;
import com.truper.service.ProductosService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductosController {
	
	private final ProductosService service;
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/producto/update/id/{id}")
	public ProductoEntity update(@PathVariable Integer id,@RequestBody ProductoDto request) throws ValidationException {
		return service.update(id, request);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/producto/update/codigo/{codigo}")
	public ProductoEntity update(@PathVariable String codigo,@RequestBody ProductoDto request) throws ValidationException {
		return service.updateByCodigo(codigo, request);
	}
	

}
