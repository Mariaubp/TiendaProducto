package tienda.tiendaproducto.repository.spec;

import org.springframework.data.jpa.domain.Specification;
import tienda.tiendaproducto.model.Producto;

public class ProductSpecification {
    public static Specification<Producto> conNombre(String nombre) {
        return (root, query, cb) ->
                nombre == null ?
                        cb.conjunction() :
                        cb.like(cb.lower(root.get("nombre")), "%" + nombre.toLowerCase() + "%");
    }

    public static Specification<Producto> esVigente(Boolean vigente) {
        return (root, query, cb) ->
                vigente == null ?
                        cb.conjunction() :
                        cb.equal(root.get("vigente"), vigente);
    }
}
