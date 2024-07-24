package com.example.my_spring_boot_application.persistence.crud;

import com.example.my_spring_boot_application.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
