package com.truper.service;

import java.util.List;

import com.truper.dto.OrdenDto;
import com.truper.entity.OrdenEntity;

public interface OrdenesService {
	
	OrdenEntity save(OrdenDto obj);
	List<OrdenEntity> get();

}
