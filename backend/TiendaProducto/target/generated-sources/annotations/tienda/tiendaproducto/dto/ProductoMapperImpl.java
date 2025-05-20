package tienda.tiendaproducto.dto;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import tienda.tiendaproducto.model.Producto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-19T21:31:31-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO toDto(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setId( producto.getId() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setDescripcion( producto.getDescripcion() );
        productoDTO.setPrecio( producto.getPrecio() );
        productoDTO.setVigente( producto.getVigente() );

        return productoDTO;
    }

    @Override
    public Producto toEntity(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( productoDTO.getId() );
        producto.setNombre( productoDTO.getNombre() );
        producto.setDescripcion( productoDTO.getDescripcion() );
        producto.setPrecio( productoDTO.getPrecio() );
        producto.setVigente( productoDTO.getVigente() );

        return producto;
    }
}
