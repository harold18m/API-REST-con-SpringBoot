package pe.tecsup.microservicios_2978.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pe.tecsup.microservicios_2978.model.Proveedor;

import java.util.Optional;

public interface ProveedorRepository extends JpaRepository<Proveedor,Integer> {
/*
    List<Proveedor> getAllProveedores();
*/
    Optional<Proveedor> findByRuc(String ruc);
    Optional<Proveedor> findByRazonSocial(String razonSocial);



}
