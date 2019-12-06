package com.demo.compose.controller.rest;

import com.demo.compose.domain.Provincia;
import com.demo.compose.service.ProvinciaService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvinciaRestController {

    private final ProvinciaService provinciaService;

    public ProvinciaRestController(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }

    @GetMapping("/provincias")
    public List<Provincia> provincias() {
        return this.provinciaService.buscarTodas();
    }

}
