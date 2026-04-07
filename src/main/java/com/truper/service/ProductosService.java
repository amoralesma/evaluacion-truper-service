package com.truper.service;

import com.truper.dto.ProductoDto;
import com.truper.entity.ProductoEntity;
import com.truper.exception.ValidationException;

public interface ProductosService {
	
	ProductoEntity update(Integer id, ProductoDto obj)throws ValidationException;
	ProductoEntity updateByCodigo(String codigo, ProductoDto obj)throws ValidationException;
	

}
