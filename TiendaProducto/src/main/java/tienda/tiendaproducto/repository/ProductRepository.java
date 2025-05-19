package tienda.tiendaproducto.repository;

import tienda.tiendaproducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Long> {
    // Consultas personalizadas si las necesitas
}
