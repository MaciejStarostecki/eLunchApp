package pl.strefakursow.elunchapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DelivererRepository extends JpaRepository<Deliverer, Long> {
    Optional<Deliverer> findByUuid(UUID uuid);
}
