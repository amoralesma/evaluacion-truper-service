package com.truper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.truper.entity.SucursalEntity;

@Repository
public interface SucursalRepository extends JpaRepository<SucursalEntity, Integer> {

}
