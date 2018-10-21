package com.personas.demo.controller.rest;

import com.personas.demo.domain.Persona;
import com.personas.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaRestController {

    
    @Autowired
    private PersonaRepository personaRepository;
    
    @GetMapping("demo/personas")
    public List<Persona> personas() {
        return personaRepository.findAll();
    }


    
}
