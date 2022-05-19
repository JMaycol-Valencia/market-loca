package com.market.local.persistence;

import com.market.local.persistence.crud.ProductoCrudRepository;
import com.market.local.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    
    public List<Producto> getAll{;
        Iterable<Producto> all = productoCrudRepository.findAll();
        return all;
    }
}
