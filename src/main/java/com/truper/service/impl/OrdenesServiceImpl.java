package com.truper.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.truper.dto.OrdenDto;
import com.truper.entity.OrdenEntity;
import com.truper.entity.ProductoEntity;
import com.truper.entity.SucursalEntity;
import com.truper.repository.OrdenRepository;
import com.truper.service.OrdenesService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdenesServiceImpl implements OrdenesService{
	
	private final OrdenRepository repository;
	
	@Override
	public OrdenEntity save(OrdenDto obj) {
		var entity=new OrdenEntity();
		
		entity.setFecha(obj.getFecha());
		entity.setTotal(obj.getTotal());
		
		List<ProductoEntity> productos= new ArrayList<>();
		obj.getProductos().forEach(p->{
			productos.add(new ProductoEntity(p.getCodigo(),
					p.getDescripcion(), p.getPrecio()));
		});
		entity.setProductos(productos);
		
		var sucursal= new SucursalEntity();
		sucursal.setNombre(obj.getSucursal().getNombre());
		entity.setSucursal(sucursal);
		
		return repository.save(entity);
	}

	@Override
	public List<OrdenEntity> get() {
		return repository.findAll();
	}

}
