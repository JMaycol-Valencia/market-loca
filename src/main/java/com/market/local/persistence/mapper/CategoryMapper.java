package com.market.local.persistence.mapper;

import com.market.local.domain.Category;
import com.market.local.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel =  "spring")
public interface CategoryMapper  {
    @Mappings({
            @Mapping(source="idCategoria", target = "categoryId"),
            @Mapping(source="descripcion", target = "category"),
            @Mapping(source="estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration            //ESTA ANOTACION INDICA A MAPSTRUCT - QUE LA SIGUIENTE CONVERSION ES LA INVERSA QUE LA DE ARRIBA
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
