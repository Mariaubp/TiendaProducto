package tienda.tiendaproducto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import tienda.tiendaproducto.dto.ProductoDTO;
import tienda.tiendaproducto.dto.ProductoMapper;
import tienda.tiendaproducto.model.Producto;
import tienda.tiendaproducto.repository.ProductRepository;
import tienda.tiendaproducto.repository.spec.ProductSpecification;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductRepository productRepository;
    private final ProductoMapper productoMapper;

    public List<ProductoDTO> filtrarProductos(String nombre, Boolean vigente) {
        Specification<Producto> spec = Specification
                .where(ProductSpecification.conNombre(nombre))
                .and(ProductSpecification.esVigente(vigente));

        return productRepository.findAll(spec)
                .stream()
                .map(productoMapper::toDto)
                .toList();
    }

    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto producto = productoMapper.toEntity(productoDTO);
        return productoMapper.toDto(productRepository.save(producto));
    }

    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        Producto producto = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        producto.setNombre(productoDTO.getNombre());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setVigente(productoDTO.getVigente());

        return productoMapper.toDto(productRepository.save(producto));
    }

    public void eliminarProducto(Long id) {
        Producto producto = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        producto.setVigente(false);
        productRepository.save(producto);
    }
}