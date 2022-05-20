package com.market.local.persistence;

import com.market.local.persistence.crud.ProductoCrudRepository;
import com.market.local.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository         //ANOTACION IMPORTANTE PARA DIFERENCIAR LOS REPOSITORIOS
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

    public Optional<Producto> getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void Delete(int idProducto){
        return productoCrudRepository.deleteById(idProducto);
    }
}
