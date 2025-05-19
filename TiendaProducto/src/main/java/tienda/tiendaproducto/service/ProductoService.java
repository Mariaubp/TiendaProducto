package tienda.tiendaproducto.service;

import tienda.tiendaproducto.model.Producto;
import tienda.tiendaproducto.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductRepository productoRepository;

    public ProductoService(ProductRepository productRepository) {
        this.productoRepository = productRepository;
    }

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }


}