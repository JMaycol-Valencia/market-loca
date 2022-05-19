package com.market.local.persistence;

import com.market.local.persistence.crud.ProductoCrudRepository;
import com.market.local.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    
    public List<Producto> getAll(){;
        Iterable<Producto> all = productoCrudRepository.findAll();
        return all;
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return  productoCrudRepository.findByCantidadStockLessThanAndEstadp(cantidad, true);
    }
}
