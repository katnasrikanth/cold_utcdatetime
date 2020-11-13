package com.melvault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melvault.entity.SensorConfig;

@Repository
public interface SensorConfigRepository extends JpaRepository<SensorConfig, Integer>{

}
