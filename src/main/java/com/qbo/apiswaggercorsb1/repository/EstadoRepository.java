package com.qbo.apiswaggercorsb1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qbo.apiswaggercorsb1.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{


	

}
