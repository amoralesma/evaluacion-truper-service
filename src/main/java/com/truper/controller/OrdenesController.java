package com.truper.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.truper.dto.OrdenDto;
import com.truper.entity.OrdenEntity;
import com.truper.service.OrdenesService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrdenesController {
	
	private final OrdenesService service;
	
	@ResponseStatus(HttpStatus.OK)
	@PostMapping("/orden/save")
	public OrdenEntity save(@RequestBody OrdenDto request) {
		return service.save(request);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/orden/get")
	public List<OrdenEntity> get() {
		return service.get();
	}

}
