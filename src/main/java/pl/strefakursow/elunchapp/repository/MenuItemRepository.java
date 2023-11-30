package pl.strefakursow.elunchapp.repository;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;
import pl.strefakursow.elunchapp.model.MenuItem;
import pl.strefakursow.elunchapp.model.enums.VatTax;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

    Optional<MenuItem> findByUuid(UUID uuid);

}
