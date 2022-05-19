package com.market.local.persistence.crud;


import com.market.local.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
