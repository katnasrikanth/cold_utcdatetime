package com.melvault.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.melvault.constants.Constants;
import com.melvault.entity.MeasurementEntity;

@Repository
public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long>{
	
	
   public  Page<MeasurementEntity> findAll(Pageable pageable);
    
	@Query(value = Constants.FIND_BY_ID)
	List<MeasurementEntity> findByIds(Long id);
	
	@Query(value = Constants.FIND_ALL_BY_TIME_BETWEEN_HOURS_AND_MINUTES)
	List<MeasurementEntity> findAllByTimeBetweenhoursandminutes(LocalDateTime datetime);
}