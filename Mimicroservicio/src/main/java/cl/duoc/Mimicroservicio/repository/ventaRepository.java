package cl.duoc.Mimicroservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.Mimicroservicio.model.venta;

@Repository
public interface ventaRepository extends JpaRepository<venta,Long> {
}

