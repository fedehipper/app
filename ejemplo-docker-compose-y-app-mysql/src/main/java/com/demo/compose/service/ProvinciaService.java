package com.demo.compose.service;

import com.demo.compose.domain.Provincia;
import com.demo.compose.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService {

    private final ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    public List<Provincia> buscarTodas() {
        return this.provinciaRepository.findAll();
    }
    
}
