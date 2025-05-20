package tienda.tiendaproducto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tienda.tiendaproducto.model.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long>, JpaSpecificationExecutor<Producto> {
}