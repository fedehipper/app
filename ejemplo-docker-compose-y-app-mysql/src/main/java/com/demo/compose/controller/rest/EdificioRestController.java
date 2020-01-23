package com.demo.compose.controller.rest;

import com.demo.compose.domain.Edificio;
import com.demo.compose.repository.EdificioRepository;
import javax.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class EdificioRestController {

    private final EdificioRepository edificioRepository;

    public EdificioRestController(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }

    @GetMapping("/edificio/{id}")
    public Edificio buscarPorId(@PathVariable Long id) {
        var mierda =  edificioRepository.findById(id).get();
        return mierda;
    }

}
