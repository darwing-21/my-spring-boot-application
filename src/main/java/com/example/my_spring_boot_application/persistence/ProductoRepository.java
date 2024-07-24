package com.example.my_spring_boot_application.persistence;

import com.example.my_spring_boot_application.persistence.crud.ProductoCrudRepository;
import com.example.my_spring_boot_application.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
