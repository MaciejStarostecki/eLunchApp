package pl.strefakursow.elunchapp.repository;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;
import pl.strefakursow.elunchapp.model.DeliveryAddress;
import pl.strefakursow.elunchapp.model.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DeliveryAddressRepository extends JpaRepository<DeliveryAddress, Long> {

    Optional<DeliveryAddress> findByUuid(UUID uuid);

}
