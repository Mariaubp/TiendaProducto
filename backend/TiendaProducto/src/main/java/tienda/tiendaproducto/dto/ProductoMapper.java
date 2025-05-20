package tienda.tiendaproducto.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tienda.tiendaproducto.model.Producto;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "precio", source = "precio")
    @Mapping(target = "vigente", source = "vigente")
    ProductoDTO toDto(Producto producto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "precio", source = "precio")
    @Mapping(target = "vigente", source = "vigente")
    @Mapping(target = "fechaCreacion", ignore = true)
    Producto toEntity(ProductoDTO productoDTO);
}