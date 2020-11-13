package com.melvault.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.melvault.entity.MeasurementEntity;
import com.melvault.entity.SensorEntity;

@Repository
public interface SensorRepository extends JpaRepository<SensorEntity, Long>{

  public   Page<SensorEntity> findAll(Pageable pageable);

  public  List<SensorEntity> findAllByName(String name);

  public   SensorEntity findById(@Param("id") long id);

public void save(MeasurementEntity measurementEntity);
  
 
}