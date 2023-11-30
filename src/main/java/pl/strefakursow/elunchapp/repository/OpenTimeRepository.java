package pl.strefakursow.elunchapp.repository;

import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.strefakursow.elunchapp.model.Deliverer;
import pl.strefakursow.elunchapp.model.OpenTime;
import pl.strefakursow.elunchapp.model.enums.DayOfWeek;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OpenTimeRepository extends JpaRepository<OpenTime, Long> {

    Optional<OpenTime> findByUuid(UUID uuid);
}
