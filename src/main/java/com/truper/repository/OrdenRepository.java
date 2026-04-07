package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truper.entity.OrdenEntity;

@Repository
public interface OrdenRepository extends JpaRepository<OrdenEntity, Integer> {

}
