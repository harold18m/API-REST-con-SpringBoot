package pe.tecsup.microservicios_2978.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.tecsup.microservicios_2978.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {
    
}
