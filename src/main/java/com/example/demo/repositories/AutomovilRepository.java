package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AutomovilModel;

@Repository
public interface AutomovilRepository extends CrudRepository<AutomovilModel, Long> {
    public abstract ArrayList<AutomovilModel> findByModelo(String modelo);
}
