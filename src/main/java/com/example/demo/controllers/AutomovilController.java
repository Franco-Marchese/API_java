package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AutomovilModel;
import com.example.demo.services.AutomovilService;

@RestController
@RequestMapping("/autos")
public class AutomovilController {
    @Autowired
    AutomovilService automovilService;

    @GetMapping()
    public ArrayList<AutomovilModel> getAutomoviles() {
        return automovilService.getAutomoviles();
    }

    @PostMapping()
    public AutomovilModel saveAutomovil(@RequestBody AutomovilModel automovil) {
        return this.automovilService.saveAutomovil(automovil);
    }

    @GetMapping(path = "/{id}")
    public Optional<AutomovilModel> getById(@PathVariable("id") Long id) {
        return this.automovilService.getById(id);
    }

    @GetMapping("/query")
    public ArrayList<AutomovilModel> getByModelo(@RequestParam("modelo") String modelo) {
        return this.automovilService.findByModelo(modelo);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.automovilService.deleteAutomovil(id);
        if (ok) {
            return "Se eliminó satisfactoriamente.";
        } else {
            return "No se pudo eliminar.";
        }
    }
}
