package com.demo.compose.repository;

import com.demo.compose.domain.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProvinciaRepository extends JpaRepository<Provincia, Long>{
    
}
