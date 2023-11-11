package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.AutomovilModel;
import com.example.demo.repositories.AutomovilRepository;

@Service
public class AutomovilService {
    @Autowired
    AutomovilRepository automovilRepository;

    // Listar todos los regsitros.
    public ArrayList<AutomovilModel> getAutomoviles() {
        return (ArrayList<AutomovilModel>) automovilRepository.findAll();
    }

    // Guardar un nuevo registro.
    public AutomovilModel saveAutomovil(AutomovilModel automovil) {
        return automovilRepository.save(automovil);
    }

    public Optional<AutomovilModel> getById(Long id) {
        return automovilRepository.findById(id);
    }

    public ArrayList<AutomovilModel> findByModelo(String modelo) {
        return automovilRepository.findByModelo(modelo);
    }

    public boolean deleteAutomovil(Long id) {
        try {
            automovilRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
