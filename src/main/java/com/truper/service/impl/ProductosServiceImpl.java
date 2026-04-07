package com.truper.service.impl;

import org.springframework.stereotype.Service;

import com.truper.dto.ProductoDto;
import com.truper.entity.ProductoEntity;
import com.truper.exception.ValidationException;
import com.truper.repository.ProductoRepository;
import com.truper.service.ProductosService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductosServiceImpl implements ProductosService{
	
	private final ProductoRepository repository;

	@Override
	public ProductoEntity update(Integer id, ProductoDto obj) throws ValidationException {
		var entityoOpt= repository.findById(id);
		
		if(!entityoOpt.isPresent())
			throw new ValidationException("id no existe");
		
		var entity=entityoOpt.get();
		entity.setCodigo(obj.getCodigo());
		entity.setDescripcion(obj.getDescripcion());
		entity.setPrecio(obj.getPrecio());
			
		return repository.save(entity);
	}

	@Override
	public ProductoEntity updateByCodigo(String codigo, ProductoDto obj) throws ValidationException {
		var entityoOpt= repository.findByCodigo(codigo);
		
		if(!entityoOpt.isPresent())
			throw new ValidationException("codigo no existe");
		
		var entity=entityoOpt.get();
		entity.setDescripcion(obj.getDescripcion());
		entity.setPrecio(obj.getPrecio());
			
		return repository.save(entity);
	}
	
	

}
